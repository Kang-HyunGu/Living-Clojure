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

; Logic Tests You Can Use on Collections
(empty? [:table :door :key])
(empty? [])
(empty? {})
(empty? '())

(defn empty?
  [coll] (not (seq coll)))

(seq [1 2 3])
(class [1 2 3])
(class (seq [1 2 3]))
(seq [])
(empty? [])
(seq [])

; Remember, use seq to check for not empty instead of (not (empty? x)).
; This is because nil is treated as logically false in tests,
; whereas a non-nil value like [1 3 4] is treated as logically true.

(every? odd? [1 3 5])
(every? odd? [1 2 3 4 5])

; A predicate is just a function that returns a value used in a logic test.

(defn drinkable? [x]
  (= x :drinkme))

(every? drinkable? [:drinkme :drinkme])
(every? drinkable? [:drinkme :poison])
(every? (fn [x] (= x :drinkme)) [:drinkme :drinkme])
(every? #(= % :drinkme) [:drinkme :drinkme])

(not-any? #(= % :drinkme) [:drinkme :poison])
(not-any? #(= % :drinkme) [:poison :poison])

(some #(> % 3) [1 2 3 4 5])
(#{1 2 3 4 5} 3)
(some #{3} [1 2 3 4 5])
(some #{4 5} [1 2 3 4 5])
(some #{nil} [nil nil nil])
(some #{false} [false false false])
(some #{true} [true true true])
