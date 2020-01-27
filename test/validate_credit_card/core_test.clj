(ns validate-credit-card.core-test
  (:require [clojure.test :refer :all]
            [validate-credit-card.core :refer :all]))

(deftest test-validation-1
  (testing "CC number validation #1"
    (is (valid? "4242424242424242"))))

(deftest test-validation-2
  (testing "CC number validation #2"
    (is (not (valid? "79927398710")))))

(deftest test-validation-3
  (testing "CC number validation #3"
    (is (valid? "79927398713"))))
