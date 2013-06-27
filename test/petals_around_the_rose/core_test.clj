(ns petals-around-the-rose.core-test
  (:use clojure.test
        petals-around-the-rose.core))

(deftest rolls-the-dice
  (testing "Returns 5 dices"
    (is (= 5 (count (roll-dices))))))

(deftest sums-five-dices
  (testing "Sums 5 dices when the algorithm is sum"
    (is (= "Correct" (guess-score 5 '(1 1 1 1 1))))))
