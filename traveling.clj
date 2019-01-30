(defn abs [x]
  (if (neg? x)
    (- x)
    x))

(-> (loop [lines (map #(clojure.string/split % #"\s")
                      (rest (line-seq (clojure.java.io/reader *in*))))
           [curr-t curr-x curr-y] [0 0 0]]
      (if-let [line (first lines)]
        (let [[t x y :as next-dest] (map #(Integer/parseInt %) line)
              d-t (- t curr-t)
              d-x (abs (- x curr-x))
              d-y (abs (- y curr-y))
              d-x+y (+ d-x d-y)]
          (if (zero? (mod d-t d-x+y))
            (recur (rest lines) next-dest)
            false))
        true))
    (if "Yes" "No")
    println)
