(defn kagami-mochi [a]
  (count (distinct a)))

(defn create-data [n]
  (loop [counter 0 arr ()]
    (if (>= counter n)
      arr
      (recur (inc counter) (cons (read) arr)))))

(println (kagami-mochi (create-data (read))))
