(ns validate-credit-card.core)

(defn compute-checksum
  "Computes the Luhn checksum digit"
  [numstr]
  (let [sum (->> numstr
                 (clojure.string/reverse)
                 (map #(- (int %) (int \0)))
                 (map-indexed vector)
                 (map #(if (even? (first %)) (* 2 (second %)) (second %)))
                 (map #(if (< 9 %) (- % 9) %))
                 (reduce +)
                 (* 9))]
    (mod sum 10)))

(defn valid?
  "Tests whether a credit card number is valid"
  [num]
  (let [numstr (str num)
        last-digit (compute-checksum (subs numstr 0 (dec (count numstr))))]
    (= (- (int (last numstr)) (int \0))
       last-digit)))
