(ns wonderland.chapter-2)

; Flow and Functional Transformations

; expression is code that can be evaluated for a result.
; form is a valid expression that can be evaluated.

(first [1 2 4]) ;form
(first [:a :b :c]) ;form
(first) ;expression

; Controlling the Flow with Logic
(class true)
(true? true)
(true? false)
(false? false)
(false? true)
(nil? nil)
(nil? 1)
(not true)
(not false)
(not nil)

; Remember, nil is logically false in tests.

(not "hi")

(= :drinkme :drinkme)
(= :drinkme 4)
(= '(:drinkme :bottle) [:drinkme :bottle])
(not= :drinkme :4)