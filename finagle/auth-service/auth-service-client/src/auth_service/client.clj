(ns auth-service.client
  (:import [auth_service.thrift AuthService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift]))

(defn make-client
  [address]
  (thrift/client address AuthService))
