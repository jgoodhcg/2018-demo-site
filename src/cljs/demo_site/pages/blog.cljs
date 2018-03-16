(ns demo-site.pages.blog
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [demo-site.events]
            [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [stylefy.core :as stylefy]
            [demo-site.global-styles :as global-styles]
            [markdown.core :refer [md->html]]))

(defn blog-page []
  )

(defn blog-list-page []
  [:div
   (when-let [blogs @(rf/subscribe [:blogs])]
     (->> blogs
          (mapv (fn [blog]
                  [:div {:dangerouslySetInnerHTML
                         {:__html (md->html (:file-contents blog))}}]))))])

