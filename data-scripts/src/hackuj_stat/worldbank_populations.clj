(ns hackuj-stat.worldbank-populations
  (:gen-class)
  (:require [clj-http.client :as client]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]
            [clojure.string :as string])
  (:import (java.util.zip GZIPOutputStream ZipInputStream)
           (org.apache.commons.io.input BOMInputStream)))

(def url "http://api.worldbank.org/v2/en/indicator/SP.POP.TOTL")

(defn- download
  "Download World Bank population statistics"
  []
  (let [params {:as :byte-array
                :query-params {"downloadformat" "csv"}}
        zip-input-stream (-> url
                             (client/get params)
                             :body
                             io/input-stream
                             ZipInputStream.)]
      (loop [zip-entry (.getNextEntry zip-input-stream)]
        (if (string/starts-with? (.getName zip-entry) "API")
          (BOMInputStream. zip-input-stream)
          (recur (.getNextEntry zip-input-stream))))))

(def selected-columns
  (map str (range 2000 2017)))

(defn- transpose-columns
  [row]
  (let [country-code (get row "Country Code")]
    (for [[year population] (select-keys row selected-columns)]
      {:country country-code
       :year year
       :population population})))

(defn transform
  "Transpose `input` CSV with World Bank population data"
  [input output]
  (with-open [reader (io/reader input)
              writer (-> output io/output-stream GZIPOutputStream. io/writer)]
    (let [[head & data] (->> reader
                             csv/read-csv
                             (drop 4)) ; Skip empty rows
          transformed (mapcat (comp transpose-columns (partial zipmap head)) data)
          header (-> transformed first keys)
          ->csv (apply juxt header)]
      (->> transformed
           (map ->csv)
           (cons (map name header))
           (csv/write-csv writer)))))

(defn -main
  [& args]
  (let [output (first (remove #{"-"} args))]
    (with-open [input (download)]
      (transform input output))))
