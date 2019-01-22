(defn coins [a b c x]
  (count
   (for [i (range 0 (inc a)) j (range 0 (inc b)) k (range 0 (inc c))
         :let [res (+ (* 500 i) (* 100 j) (* 50 k))]
         :when (= res x)]
     res)))

(println (coins (read) (read) (read) (read)))
