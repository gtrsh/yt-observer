(ns yt-obs-server.yt-dlp
  (:require [clojure.java.shell :refer [sh]]))

(def YT-DLP "yt-dlp")
(def JSON "--dump-single-json")

(def URL-VID "https://www.youtube.com/watch?v=")
(def URL-CHAN "https://www.youtube.com/")

(defn yt-dlp-version
  []
  (sh YT-DLP "--version"))

(defn yt-dlp-video-data
  [id]
  (sh YT-DLP JSON (str URL-VID id)))

(defn yt-dlp-channel-data
  [channel-id resource-type]
  (sh YT-DLP JSON (str URL-CHAN channel-id "/" resource-type)))

(comment
  (require '[cheshire.core :refer [parse-string]])
  (yt-dlp-version)
  (yt-dlp-video-data "UWh1pe3ApDo")
  (yt-dlp-channel-data "@PiterPyConference" "shorts")

  (parse-string (:out (yt-dlp-video-data "UWh1pe3ApDo")))
  (parse-string (:out (yt-dlp-channel-data "@PiterPyConference" "shorts")))

  :end)
