(ns product.core)

(defn product [a b]
  (if (zero? (rem (* a b) 2))
    "Even"
    "Odd"))

(println (product (read) (read)))
