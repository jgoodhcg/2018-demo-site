(ns demo-site.pages.apps
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [demo-site.events]
            [demo-site.components.list-page :refer [item-card]]
            [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [stylefy.core :as stylefy]
            [demo-site.global-styles :as global-styles]))


(def apps [{:avatar "https://dummyimage.com/300x300/000/fff"
            :title "Time Align"
            :subtitle "Bring what you want closer to what you do"
            :text "A clojure open source web application for planning and tracking time. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long. What happens when this is like ubbber long."
            :github "https://github.com/goodsoftwareengineering/time-align"
            :link "https://timealign.io"
            :media-image "https://dummyimage.com/1600x900/000/fff"}

           {:avatar "https://dummyimage.com/300x300/000/fff"
            :title "Chore Chart"
            :subtitle "A possibly useful experiment with re-frame."}])

(defn apps-page []
  [:div (doall (->> apps (map item-card)))])
