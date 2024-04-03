(ns user-service.service
  (:import [user_service.thrift UserService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift])
  (:gen-class))

(defn make-service
  []
  (thrift/service UserService
    ;; TODO implement service methods
    ))

(defn -main
  [& args]
  (f/await (thrift/serve ":9999" (make-service))))
