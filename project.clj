(defproject diegoescala/validate-credit-card "1.0.0"
  :description "A Clojure library for easily validating credit card numbers"
  :url "https://github.com/diegoescala/validate-credit-card"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns validate-credit-card.core}
  :deploy-repositories [["releases"  {:sign-releases false
                                      :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false
                                      :url "https://clojars.org/repo"}]])
