(ns demo-site.app
  (:require [demo-site.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
