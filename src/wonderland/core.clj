(ns wonderland.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(/ 1 3)

(/ 1 3.0)

"jam"

:jam

\j

true

false

nil

(+ 1 1)

(+ 1 (+ 8 3))

'(1 2 "jam" :marmalade-jar)

'(1, 2, "jam", :bee)

(first '(:rabbit :pocket-watch :marmalade :door))

(rest '(:rabbit :pocket-watch :marmalade :door))

(first (rest '(:rabbit :pocket-watch :marmalade :door)))

(first (rest (rest '(:rabbit :pocket-watch :marmalade :door))))

(first (rest (rest (rest '(:rabbit :pocket-watch :marmalade :door)))))

(first (rest (rest (rest (rest '(:rabbit :pocket-watch :marmalade :door))))))

