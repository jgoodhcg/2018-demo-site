(ns ^:figwheel-no-load demo-site.app
  (:require [demo-site.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
