(defproject alloy/three "0.1.0-SNAPSHOT"
	:plugins [[lein-modules "0.3.11"] [lein-cljsbuild "1.1.0"]]
  :description "FIXME: write description"
  :dependencies [[alloy/core :version] [cljsjs/three "0.0.72-0"]]
	:source-paths ["src"]

	:cljsbuild {:builds [{:source-paths ["src"]

												:compiler {
																	 :output-to "resources/public/js/alloy/three.js"
																	 :optimizations :whitespace
																	 :pretty-print true
																	 }}]}

	:clean-targets ^{:protect false} [:target-path "resources/public/js"])