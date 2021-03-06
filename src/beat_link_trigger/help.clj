(ns beat-link-trigger.help
  "Serves the embedded copy of the user guide."
  (:require [compojure.route :as route]
            [compojure.core :as compojure]
            [org.httpkit.server :as server]))

(defn show-landing-page
  "The home page for the embedded web server, currently does not do
  much, nobody is expected to ever try to load it."
  [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Beat Link Trigger."})

(compojure/defroutes all-routes
  (compojure/GET "/" [] show-landing-page)
  (route/resources "/guide/" {:root "user_guide"})
  (route/not-found "<p>Page not found.</p>"))

;; Once the server is started, holds a map where :port contains the
;; port number on which the server is listening, and :stop contains
;; the function that will shut it down.
(defonce ^:private running-server (atom nil))

(defn help-server
  "Starts the embedded web server, if needed, and returns the port
  number on which it can be reached, or `nil` if it could not be
  started."
  []
  (locking running-server
    (when-not @running-server
      (loop [port 9889]
        (try
          (reset! running-server {:port port
                                  :stop (server/run-server all-routes {:port port})})
          (catch java.net.BindException e))  ; We will just retry until we are out of ports.
        (when (and (not @running-server) (< port 65536))
          (recur (inc port)))))
    (:port @running-server)))

(defn stop-server
  "Shuts down the embedded web server, if it is running."
  []
  (locking @running-server
    (when @running-server
      ((:stop @running-server))
      (reset! running-server nil))))

(defn show-user-guide
  "Opens a web browser window on the locally-served user guide copy,
  starting the embedded web server if needed."
  []
  (if-let [port (help-server)]
    (clojure.java.browse/browse-url (str "http://127.0.0.1:" port "/guide/README.html"))))
