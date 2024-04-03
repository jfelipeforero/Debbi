(ns user-service.client
  (:import [user_service.thrift UserService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift]))

(defn make-client
  [address]
  (thrift/client address UserService))
