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

; Harnessing the Power of Flow Control
(if true "it is true" "it is false")
(if false "it is true" "it is false")
(if nil "it is true" "it is false")
(if (= :drinkme :drinkme)
  "Try it"
  "Don't try it")

(let [need-to-grow-small (> 5 3)]
  (if need-to-grow-small
    "drink bottle"
    "don't drink bottle"))

(if-let [need-to-grow-small (> 5 1)]
  "drink bottle"
  "don't drink bottle")

(defn drink [need-to-grow-small]
  (when need-to-grow-small "drink bottle"))

(drink true)
(drink false)

(when-let [need-to-grow-small true]
  "drink bottle")
(when-let [need-to-grow-small false]
  "drink bottle")

(let [bottle "drinkme"]
  (cond
    (= bottle "poison") "don't touch"
    (= bottle "drinkme") "grow smaller"
    (= bottle "empty") "all gone"))

(let [x 5]
  (cond
    (> x 10) "bigger than 10"
    (> x 4)  "bigger than 4"
    (> x 3)  "bigger than 3"))

(let [x 5]
  (cond
    (> x 3)  "bigger than 3"
    (> x 10) "bigger than 10"
    (> x 4)  "bigger than 4"))

(let [x 1]
  (cond
    (> x 10) "bigger than 10"
    (> x 4)  "bigger than 4"
    (> x 3)  "bigger than 3"))

(let [bottle "mystery"]
  (cond
    (= bottle "poison") "don't touch"
    (= bottle "drinkme") "grow smaller"
    (= bottle "empty") "all gone"
    :else "unknown"))

(let [bottle "mystery"]
  (cond
    (= bottle "poison") "don't touch"
    (= bottle "drinkme") "grow smaller"
    (= bottle "empty") "all gone"
    "default" "unknown"))

(let [bottle "drinkme"]
  (case bottle
    "poison" "don't touch"
    "drinkme" "grow smaller"
    "empty" "all gone"))

(let [bottle "mystery"]
  (case bottle
    "poison" "don't touch"
    "drinkme" "grow smaller"
    "empty" "all gone"))

(let [bottle "mystery"]
  (case bottle
    "poison" "don't touch"
    "drinkme" "grow smaller"
    "empty" "all gone"
    "unknown"))