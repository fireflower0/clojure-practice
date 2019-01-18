(ns placing-marbles.core)

(defn placing-marbles [s]
  (count (filter #(= \1 %) s)))

(println (placing-marbles (read-line)))
