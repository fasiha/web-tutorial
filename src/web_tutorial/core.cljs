(ns web-tutorial.core
  (:require [sablono.core :as sab]
            [web-tutorial.components :refer [like-seymore]]))

(defonce app-state (atom { :likes 0 }))

(defn render! []
  (.render js/ReactDOM
           (like-seymore app-state)
           (.getElementById js/document "app")))

(add-watch app-state :on-change (fn [_ _ _ _] (render!)))

(render!)
