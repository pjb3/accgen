;Clojure Implementation of the Accumulator Generator problem
;see http://www.paulgraham.com/accgen.html for details
;
;To run this from the command line:
;
;  java -jar clojure.jar accgen.clj
;
;This solution is much more verbose than the solution for Ruby or other Lisps,
;mainly because the problem uses mutable state.  This is understandable because
;one of the goals of Clojure is to make immutability the default case, 
;and mutability the exception, which is the opposite of most other languages.

(defn foo [n] 
  (let [r (atom n)]
    (fn [i] (swap! r + i))))

(let [acc (foo 1)] 
  (doseq [n (range 2 6)] 
    (println (str n ": " (acc n)))))