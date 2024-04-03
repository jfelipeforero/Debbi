(defproject user-service "0.1.0-SNAPSHOT"
  :description "meta-project for user-service. Run lein sub install to build all modules"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-sub "0.3.0"]]
  :sub ["user-service-core" "user-service-service" "user-service-client"]
  :dependencies [
                ])
