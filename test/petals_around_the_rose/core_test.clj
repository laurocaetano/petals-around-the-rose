(ns petals-around-the-rose.core-test
  (:use clojure.test
        petals-around-the-rose.core))

(deftest rolls-the-dice
  (testing "Returns 5 dices"
    (is (= 5 (count (roll-dices))))))
