(ns petals-around-the-rose.core)

(defn roll-dices 
  []
  (take 5 
    (for [x (range 5)] 
      (+ 1 (rand-int 5)))))

(defn guess-score
  [guessed-value dices]
  (let [answer (apply + dices)]
    (if (= guessed-value answer)
      "Correct"
      (format "The correct score is %d." answer))))

