(defn otoshidama [n y]
  (for [a (range 0 (inc n)) b (range (- (inc n) a))
        :let [c (- n a b)]
        :when (= (+ (* 10000 a) (* 5000 b) (* 1000 c)) y)]
    (format "%d %d %d" a b c)))

(defn main []
  (let [res (first (otoshidama (read) (read)))]
    (if (nil? res)
      (println "-1 -1 -1")
      (println res))))

(main)
