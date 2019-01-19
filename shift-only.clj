(defn shift-only [n a]
  (loop [counter 0 arr a]
    (if (not-every? even? arr)
        counter
        (recur (+ counter 1) (map #(/ % 2) arr)))))

(defn create-data [s]
  (map #(bigint %) (.split s " ")))

(println (shift-only (Long/parseLong (read-line)) (create-data (read-line))))
