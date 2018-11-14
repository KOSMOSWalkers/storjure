(ns ^:figwheel-no-load stor.dev
  (:require
    [stor.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
