(ns belvo-service.service
  (:import [belvo_service.thrift BelvoService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift])
  (:gen-class))

(defn make-service
  []
  (thrift/service BelvoService
    ;; TODO implement service methods
    ))

(defn -main
  [& args]
  (f/await (thrift/serve ":9999" (make-service))))
