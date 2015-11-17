(defproject continuance/core "0.1.0-SNAPSHOT"
	:plugins [[lein-modules "0.3.11"] [lein-cljsbuild "1.1.0"]]
	:description "FIXME: write description"
	:dependencies [[reacort/core :version]]
	:source-paths ["src/clj" "src/cljs" "src/cljc"]

	:cljsbuild {:builds [{:source-paths ["src/cljc"  "src/cljs"]

												:compiler {
																	 :output-to "resources/public/js/continuance/core.js"
																	 :optimizations :whitespace
																	 :pretty-print true
																	 }}]}
	:clean-targets ^{:protect false} [:target-path "resources/public/js"])