(defproject alloy.continuance/continuance "0.1.0-SNAPSHOT"
  :plugins [[lein-modules "0.3.11"]]
  :description "FIXME: write description"

  :profiles {
    :provided {
               :dependencies [[org.clojure/clojure "_"] [org.clojure/clojurescript "_"]]
               }}

  :modules {
            :inherited {:url "http://example.com/FIXME"
                        :license { :name "Eclipse Public License"
                                  :url "http://www.eclipse.org/legal/epl-v10.html" }}

            :versions { org.clojure/clojure "1.7.0"
											 org.clojure/clojurescript "1.7.145"
											 alloy :version}})