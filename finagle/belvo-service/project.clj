(defproject belvo-service "0.1.0-SNAPSHOT"
  :description "meta-project for belvo-service. Run lein sub install to build all modules"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-sub "0.3.0"]]
  :sub ["belvo-service-core" "belvo-service-service" "belvo-service-client"]
  :dependencies [
                ])
