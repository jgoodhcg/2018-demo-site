(ns demo-site.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [demo-site.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[demo-site started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[demo-site has shut down successfully]=-"))
   :middleware wrap-dev})
