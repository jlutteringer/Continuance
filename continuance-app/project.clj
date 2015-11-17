(defproject continuance/app "0.1.0-SNAPSHOT"
	:plugins [[lein-modules "0.3.11"] [lein-cljsbuild "1.1.0"]]
	:description "FIXME: write description"
	:dependencies [[reactor/engine :version]]
	:source-paths ["src"]

	:cljsbuild {:builds [{:source-paths ["src"]

												:compiler {
																	 :output-to "resources/public/js/continuance/app.js"
																	 :optimizations :whitespace
																	 :pretty-print true
																	 }}]}
	:clean-targets ^{:protect false} [:target-path "resources/public/js"])