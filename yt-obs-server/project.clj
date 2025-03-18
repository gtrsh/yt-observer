(defproject yt-obs-server "0.1.0-SNAPSHOT"
  :description "yt-obs server"
  :url "https://github.com/gtrsh/yt-observer"
  :license {:name "EULA"}
  :dependencies [[org.clojure/clojure "1.12.0"]]
  :main ^:skip-aot yt-obs-server.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
