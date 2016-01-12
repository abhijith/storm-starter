(defproject storm-starter "0.0.1-SNAPSHOT"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :test-paths ["test/jvm"]
  :resource-paths ["multilang"]
  :aot :all
  :repositories {}

  :dependencies [[commons-collections/commons-collections "3.2.1"]]
  :profiles {:dev
             {:dependencies [[org.apache.storm/storm-core "0.10.0"]
                             [cider/cider-nrepl "0.11.0-SNAPSHOT"]
                             [org.clojure/tools.nrepl "0.2.12"]
                             [org.clojure/clojure "1.7.0"]
                             [org.testng/testng "6.8.5"]
                             [org.easytesting/fest-assert-core "2.0M8"]
                             [org.mockito/mockito-all "1.9.0"]
                             [org.jmock/jmock "2.6.0"]]}}
  :min-lein-version "2.0.0"
  :main storm.starter.clj.word-count
  )
