(defn find-sum-of-digits [n]
  (->> (str n)
       (map #(- (int %) 48))
       (reduce +)))

(defn some-sums [[n a b]]
  (reduce +
          (for [i (range 1 (inc n))
                :let [sum (find-sum-of-digits i)]
                :when (<= a sum b)] i)))

(defn create-data [s]
  (map #(Long/parseLong %) (.split s " ")))

(println (some-sums (create-data (read-line))))
