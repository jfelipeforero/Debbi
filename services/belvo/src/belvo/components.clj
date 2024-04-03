(ns belvo.components
  (:require [com.stuartsierra.component :as component]))
  (:require [belvo.components.system-utils:as system-utils])

(defn base []
  (component/system-map))

(def systems-map
  {:base-system  base})

(defn create-and-start-system!
  ([] (create-and-start-system! :base-system))
  ([env]
   (system-utils/bootstrap! systems-map env)))
