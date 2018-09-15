(ns hackuj-stat.csu-foreigners
  (:gen-class)
  (:require [clj-http.client :as client]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [net.cgrand.enlive-html :as enlive])
  (:import (java.net URL)
           (java.util.zip GZIPOutputStream ZipInputStream)
           (org.apache.commons.io.input BOMInputStream)))

(def url "https://www.czso.cz/csu/czso/cizinci-podle-statniho-obcanstvi-veku-a-pohlavi")
(def selector [:.odkaz-style-wrapper [:a (enlive/attr-starts :title "Data")]])

(defn urls
  "Get URLs of zipped CSV files to download."
  []
  (let [elements (-> url
                     URL.
                     enlive/html-resource
                     (enlive/select selector))]
    (map (comp :href :attrs) elements)))

(defn download
  "Download `url` of zipped CSV and parse it."
  [url]
  (with-open [reader (-> url
                         (client/get {:as :byte-array})
                         :body
                         io/input-stream
                         ZipInputStream.
                         (doto .getNextEntry)
                         BOMInputStream.
                         io/reader)]
    (let [[head & data] (csv/read-csv reader)
          header (map keyword head)]
      (doall (map (partial zipmap header) data)))))

(defn seq->csv
  "Convert sequence `coll` to CSV and write it to a gzipped `output` file."
  [output coll]
  (let [head (-> coll first keys)
        header (map name head)
        ->csv (apply juxt head)]
    (with-open [writer (-> output io/output-stream GZIPOutputStream. io/writer)]
      (->> coll
           (map ->csv)
           (cons header)
           (csv/write-csv writer)))))

(defn -main
  [& args]
  (let [output (first (remove #{"-"} args))]
    (->> (urls)
         (mapcat download)
         (seq->csv output))))
