(ns validate-credit-card.core-test
  (:require [clojure.test :refer :all]
            [validate-credit-card.core :refer :all]))

(deftest test-validation
  (testing "CC number validation"
    (is (and (validate "4242424242424242")
             (not (validate "79927398710"))
             (validate "79927398713")))))
