(ns petals-around-the-rose.core-test
  (:use clojure.test
        petals-around-the-rose.core))

(deftest rolls-the-dice
  (testing "Returns 5 dices"
    (is (= 5 (count (roll-dices))))))

(deftest correct-guess-returns-correct
  (testing "Returns 'Correct' when the guess is correct."
    (is (= "Correct" (guess-score 5 '(1 1 1 1 1))))))

(deftest wrong-guess-returns-the-anwser
  (testing "Returns the correct result when the guess is wrong"
    (is (= "The correct score is 5." (guess-score 9 '(1 1 1 1 1))))))