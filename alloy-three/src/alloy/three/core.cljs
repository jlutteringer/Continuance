(ns alloy.three.core
	(:require [alloy.core.core :as alloy]
						[cljsjs.three]))

(def camera (js/THREE.PerspectiveCamera. 75 (/ (.-innerWidth js/window)
																						(.-innerHeight js/window)) 1 10000))
(set! (.-z (.-position camera)) 1000)
(def scene (js/THREE.Scene.))
(def geometry (js/THREE.CubeGeometry. 200 200 200))
(def obj (js/Object.))
(set! (.-color obj) 0xff0000)
(set! (.-wireframe obj) true)
(def material (js/THREE.MeshBasicMaterial. obj))
(def mesh (js/THREE.Mesh. geometry material))
(.add scene mesh)
(def renderer (js/THREE.WebGLRenderer.))
(.setSize renderer (.-innerWidth js/window) (.-innerHeight js/window))
(.appendChild (.-body js/document) (.-domElement renderer))

(defn render []
	(set! (.-x (.-rotation mesh)) (+ (.-x (.-rotation mesh)) 0.01))
	(set! (.-y (.-rotation mesh)) (+ (.-y (.-rotation mesh)) 0.02))
	(.render renderer scene camera))

(defn animate []
	(.requestAnimationFrame js/window animate)
	(render))

(animate)