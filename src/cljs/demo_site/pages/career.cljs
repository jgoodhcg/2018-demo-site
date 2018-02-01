(ns demo-site.pages.career
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [demo-site.events]
            [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [stylefy.core :as stylefy]
            [demo-site.global-styles :as global-styles]))

(defn career-page []
  [:div "career-page"])

