(ns demo-site.pages.home
  (:require  [reagent.core :as r]
             [re-frame.core :as rf]
             [demo-site.events]
             [cljsjs.material-ui]
             [cljs-react-material-ui.core :refer [get-mui-theme color]]
             [cljs-react-material-ui.reagent :as ui]
             [cljs-react-material-ui.icons :as ic]
             [stylefy.core :as stylefy]
             [demo-site.global-styles :as global-styles]))

(def style-image-break 1000)

(def style-home-page {:display         "flex"
                      :justify-content "center"})

(def style-shrinking-container {:display         "flex"
                                :flex-wrap       "nowrap"
                                :align-items     "stretch"
                                :flex-direction  :row
                                :width "70%"
                                ::stylefy/media  {{:max-width (str style-image-break "px")}
                                                  {:flex-direction :column
                                                   :width "100%"}}})

(def style-card-container {:display "flex"
                           :flex "0 1 auto"})

(defn home-page []

  [:div (stylefy/use-style style-home-page)

   [:div (stylefy/use-style style-shrinking-container)
    [:div (stylefy/use-style style-card-container)
     [ui/card
      [ui/card-media [:img {:src
                            ;; (str js/context "/img/file-name-in-resources-public-img.jpg")
                            "https://dummyimage.com/1600x900/1568c0/ffffff.jpg&text=A+nice+picture+of+me"
                            :alt "a decent picture of myself"}]]]]
    [:div (stylefy/use-style style-card-container)
     [ui/paper {:style {:padding "1em"
                        :width   "100%"}}
      [:div [:p "this is some bio this content has a bunch more stuff"]]]]
    ]
   

   ])
