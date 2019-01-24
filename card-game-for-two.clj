(defn card-game-for-two [n a]
  (let [arr (sort > a)]
    (loop [counter 0 alice 0 bob 0]
      (if (>= counter n)
        (int (- alice bob))
        (if (even? counter)
          (recur (inc counter) (+ alice (nth arr counter)) bob)
          (recur (inc counter) alice (+ bob (nth arr counter))))))))

(defn create-data [s]
  (map #(bigint %) (.split s " ")))

(println (card-game-for-two (Long/parseLong (read-line)) (create-data (read-line))))
