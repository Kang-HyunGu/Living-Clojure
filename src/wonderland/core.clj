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

(cons 5 '())

(cons 5 nil)

(cons 4 (cons 5 nil))

(cons 3 (cons 4 (cons 5 nil)))

(cons 2 (cons 3 (cons 4 (cons 5 nil))))

'(1 2 3 4 5)

(list 1 2 3 4 5)

[:jar1 1 2 3 :jar2]

(first [:jar1 1 2 3 :jar2])

(rest [:jar1 1 2 3 :jar2])

(nth [:jar1 1 2 3 :jar2] 0)

(nth [:jar1 1 2 3 :jar2] 2)

(last [:rabbit :pocket-watch :marmalade])

(last '(:rabbit :pocket-watch :marmalade))