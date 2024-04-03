(defproject belvo-service-client "0.1.0-SNAPSHOT"
  :description "Thrift client for belvo-service"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.8.0"]]}}
  :dependencies [
                 [belvo-service-core "0.1.0-SNAPSHOT"]
                 [finagle-clojure/thrift "0.7.0"]
                ])
