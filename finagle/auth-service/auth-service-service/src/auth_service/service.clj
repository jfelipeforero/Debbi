(ns auth-service.service
  (:import [auth_service.thrift AuthService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift])
  (:gen-class))

(defn make-service
  []
  (thrift/service AuthService
    ;; TODO implement service methods
    ))

(defn -main
  [& args]
  (f/await (thrift/serve ":9999" (make-service))))
