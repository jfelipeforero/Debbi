(defproject user-service-service "0.1.0-SNAPSHOT"
  :description "Thrift service implementation for user-service"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main user-service.service
  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [user-service-core "0.1.0-SNAPSHOT"]
                 [finagle-clojure/thrift "0.7.0"]
                ])
