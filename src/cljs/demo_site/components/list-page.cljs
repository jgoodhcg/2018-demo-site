(ns demo-site.components.list-page
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [demo-site.events]
            [cljsjs.material-ui]
            [cljs-react-material-ui.core :refer [get-mui-theme color]]
            [cljs-react-material-ui.reagent :as ui]
            [cljs-react-material-ui.icons :as ic]
            [stylefy.core :as stylefy]
            [demo-site.global-styles :as global-styles]))

(def style-list-page {:display "flex"
                      :justify-content "center"})

(def style-card-container {:display "flex"
                           :width "60%"
                           :justify-content "center"
                           :margin-bottom "1em"
                           ::stylefy/media {{:max-width (str global-styles/phone-width "px")}
                                            {:width "100%"}}})

(def style-card {:width "100%"})

(def style-card-text {:display "flex"
                      :flex-wrap "wrap"
                      ::stylefy/media {{:max-width (str global-styles/phone-width "px")}
                                       {:flex-direction "column"}}})

(defn item-card [{:keys [avatar title subtitle text github link media-image]}]
  [:div (merge {:key (str title)} (stylefy/use-style style-list-page))
   [:div (stylefy/use-style style-card-container)
    [ui/card {:key (str title subtitle "app-card") :style style-card}

     [ui/card-header (merge
                      (when (some? avatar) {:avatar avatar})
                      (when (some? title) {:title title})
                      (when (some? subtitle) {:subtitle subtitle})
                      (when (some? media-image) {:actAsExpander true
                                                 :showExpandableButton true}))]

     (when (some? media-image)
       [ui/card-media {:expandable true}
        [:img {:src media-image}]])

     (when (some? text) [ui/card-text {:expandable true} [:p text]])

     (when (or (some? github) (some? link))
       [ui/divider])

     (when (or (some? github) (some? link))
       [ui/card-text
        [:div (stylefy/use-style style-card-text)
         (when (some? github) [ui/flat-button {:href github :label "github"
                                               :primary true}])
         (when (some? link)   [ui/flat-button {:href link :label title
                                               :primary true}])]])]]])

