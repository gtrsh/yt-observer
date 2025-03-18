(ns yt-obs-server.yt-dlp
  (:require [clojure.java.shell :refer [sh]]))

(defn yt-dlp-version
  []
  (sh "yt-dlp" "--version" ))

(comment
  (yt-dlp-version))
