(ns belvo.server
  (:gen-class)
  (:require [belvo.components :as components]))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (println "\nCreating your server...")
  (components/create-and-start-system! :base-system))
