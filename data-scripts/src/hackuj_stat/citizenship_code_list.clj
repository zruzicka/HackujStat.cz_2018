(ns hackuj-stat.citizenship-code-list
  (:gen-class)
  (:require [clj-http.client :as client]
            [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

(def api-endpoint "https://apl.czso.cz/iSMS/cisexp.jsp")
(def selected-columns [:CHODNOTA :ZKRTEXT :TEXT :KOD_SDMX])

(defn- download
  "Download the code list as a stream."
  []
  (let [query-params {:typdat 0
                      :kodcis 3228
                      :cisjaz 8260
                      :format 2
                      :separator \,}
        params {:as :stream
                :query-params query-params}]
    (-> api-endpoint
        (client/get params)
        :body)))

(defn- write
  [output]
  (with-open [reader (io/reader (download))
              writer (-> output io/output-stream io/writer)]
    (let [[head & data] (csv/read-csv reader)
          header (map keyword head)
          ->csv (apply juxt selected-columns)]
      (->> data
           (map (comp ->csv (partial zipmap header)))
           (remove (partial every? empty?)) ; Remove empty rows
           (cons (map name selected-columns))
           (csv/write-csv writer)))))

(defn -main
  [& args]
  (let [output (first (remove #{"-"} args))]
    (write output)))
