(defproject opa4j "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/data.json "2.4.0"]]
  :plugins [[lein-ancient "1.0.0-RC3"]
            [lein-kibit "0.1.8"]
            [jonase/eastwood "1.2.3"]
            [com.github.clj-kondo/lein-clj-kondo "0.1.3"]]
  :repl-options {:init-ns opa4j.core}
  :main opa4j.core
  :aot [opa4j.core]
  :aliases {"lint" ["do" ["eastwood"] ["kibit"] ["clj-kondo" "--lint" "src" "test"]]})
