(defproject skellybob "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [aleph "0.4.4"]
                 [bidi "2.1.3"]
                 [buddy "2.0.0"]
                 [hiccup "1.0.5"]
                 [cheshire "5.8.0"]
                 [aero "1.1.3"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-devel "1.6.3"]]
  :main ^:skip-aot skellybob.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
