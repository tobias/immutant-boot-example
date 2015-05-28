(set-env!
  :dependencies   '[[org.clojure/clojure "1.6.0" :scope "provided"]
                    [org.immutant/immutant "2.0.1"]]
  :resource-paths #{"src"})

(task-options!
  pom {:project 'immutant-boot-example
       :version "0.1.0"
       :description "Example Immutant app using Boot"
       :url "https://github.com/tobias/immutant-boot-example"
       :scm {:url "https://github.com/tobias/immutant-boot-example"}
       :license {"Apache Software License - v 2.0"
                 "http://www.apache.org/licenses/LICENSE-2.0"}}

  jar {:main 'immutant-boot-example.main}
  aot {:namespace #{'immutant-boot-example.main}})

(deftask uberjar []
  (comp (aot) (uber) (pom) (jar)))
