(ns demo-site.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [demo-site.core-test]))

(doo-tests 'demo-site.core-test)

