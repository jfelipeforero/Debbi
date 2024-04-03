(defproject belvo-service-service "0.1.0-SNAPSHOT"
  :description "Thrift service implementation for belvo-service"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main belvo-service.service
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [belvo-service-core "0.1.0-SNAPSHOT"]
                 [finagle-clojure/thrift "0.7.0"]
                ])
