(defn daydream []
  (let [s (apply str (vec (reverse (read-line))))
        divide '("maerd" "remaerd" "esare" "resare")
        l (count s)]
    (loop [cnt 0 pos 0 flg 0]
      (if (and (< cnt 4) (< pos l))
        (if (>= (count s) (+ (count (nth divide cnt)) pos))
          (if (= (subs s pos (+ (count (nth divide cnt)) pos)) (nth divide cnt))
            (recur 0 (+ pos (count (nth divide cnt))) 1)
            (recur (inc cnt) pos 0))
          (if (= (subs s pos) (nth divide cnt))
            (recur 0 (+ pos (count (nth divide cnt))) 1)
            (recur (inc cnt) pos 0)))
        (if (= flg 1) "YES" "NO")))))

(println (daydream))
