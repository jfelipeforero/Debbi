(ns belvo-service.client
  (:import [belvo_service.thrift BelvoService])
  (:require [finagle-clojure.futures :as f]
            [finagle-clojure.thrift :as thrift]))

(defn make-client
  [address]
  (thrift/client address BelvoService))
