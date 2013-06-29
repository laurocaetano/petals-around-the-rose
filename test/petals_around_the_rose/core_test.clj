(ns petals-around-the-rose.core-test
  (:use clojure.test
        petals-around-the-rose.core))

(deftest rolls-the-dice
  (testing "Returns 5 dices"
    (is (= 5 (count (roll-dices))))))

(deftest correct-guess-returns-correct
  (testing "Returns 'Correct' when the guess is correct."
    (let [dices (roll-dices) 
          correct-score (apply + dices)]
      (is (= "Correct" 
             (guess-score correct-score dices))))))

(deftest wrong-guess-returns-the-answer
  (testing "Returns the correct result when the guess is wrong"
    (let [dices (roll-dices) 
          correct-score (apply + dices)]
      (is (= (format "The correct score is %d." correct-score) 
             (guess-score (+ 1 correct-score) dices))))))