(ns immutant-boot-example.main
  (:require [immutant.web :as web])
  (:gen-class))

(defn handler [req]
  {:status 200
   :body "Hi from Immutant!"})

(defn -main [& args]
  (web/run #'handler))
