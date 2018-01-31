(ns user
  (:require [luminus-migrations.core :as migrations]
            [demo-site.config :refer [env]]
            [mount.core :as mount]
            [demo-site.figwheel :refer [start-fw stop-fw cljs]]
            [demo-site.core :refer [start-app]]))

(defn start []
  (mount/start-without #'demo-site.core/repl-server))

(defn stop []
  (mount/stop-except #'demo-site.core/repl-server))

(defn restart []
  (stop)
  (start))

(defn migrate []
  (migrations/migrate ["migrate"] (select-keys env [:database-url])))

(defn rollback []
  (migrations/migrate ["rollback"] (select-keys env [:database-url])))

(defn create-migration [name]
  (migrations/create name (select-keys env [:database-url])))


