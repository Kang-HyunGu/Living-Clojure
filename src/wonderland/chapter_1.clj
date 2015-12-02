(ns wonderland.chapter-1)

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

; All collections are immutable and persistent
(count [1 2 3 4])

(conj [:toast :butter] :jam)
(conj [:toast :butter] :jam :honey)
(conj '(:toast :butter) :jam)
(conj '(:toast :butter) :jam :honey)

; Maps for Storing Key-Value Pairs of Data
{:jam1 "strawberry", :jam2 "blackberry"}
{:jam1 "strawberry" :jam2 "blackberry"}

(get {:jam1 "strawberry" :jam2 "blackberry"} :jam2)
(get {:jam1 "strawberry" :jam2 "blackberry"} :jam3 "not found")
(:jam2 {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})
(keys {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})
(vals {:jam1 "strawberry" :jam2 "blackberry" :jam3 "marmalade"})

; Remember, collections are immutable.
; A function to change a collection gives you back a new version of the collection
(assoc {:jam1 "red" :jam2 "black"} :jam1 "orange")
(dissoc {:jam1 "strawberry" :jam2 "blackberry"} :jam1)
(merge {:jam1 "red" :jam2 "black"}
       {:jam1 "orange" :jam3 "red"}
       {:jam4 "blue"})

; Using sets for Unique Collections of Data
#{:red :blue :white :pink}
#{:red :blue :white :pink :pink}

(clojure.set/union #{:r :b :w} #{:w :p :y})
(clojure.set/difference #{:r :b :w} #{:w :p :y})
(clojure.set/intersection #{:r :b :w} #{:w :p :y})

(set [:rabbit :rabbit :watch :door])
(set {:a 1 :b 2 :c 3})

(get #{:rabbit :door :watch} :rabbit)
(get #{:rabbit :door :watch} :jar)
(:rabbit #{:rabbit :door :watch})
(#{:rabbit :door :watch} :rabbit)
(contains? #{:rabbit :door :watch} :rabbit)
(contains? #{:rabbit :door :watch} :jam)

(conj #{:rabbit :door} :jam)
(disj #{:rabbit :door} :door)