(ns demo-site.routes.home
  (:require [demo-site.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]
            [clojure.string :as str]))

(defn home-page []
  (layout/render "home.html"))

(defroutes home-routes
  (GET "/" []
       (home-page))
  (GET "/docs" []
       (-> (response/ok (-> "docs/docs.md" io/resource slurp))
           (response/header "Content-Type" "text/plain; charset=utf-8")))
  (GET "/blogs" []
       (-> (response/ok (->>
                         (file-seq (clojure.java.io/file "./resources/blogs/published"))
                         (filter #(.isFile %))
                         (mapv (fn [file-pointer] {:file-name (str file-pointer)}))
                         (mapv (fn [file-data]
                                 (merge file-data
                                        {:file-contents (slurp (:file-name file-data))})))))
           (response/header "Content-Type"  "text/plain; charset=utf-8"))))

