(defproject auth-service-service "0.1.0-SNAPSHOT"
  :description "Thrift service implementation for auth-service"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main auth-service.service
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [auth-service-core "0.1.0-SNAPSHOT"]
                 [finagle-clojure/thrift "0.7.0"]
                ])
