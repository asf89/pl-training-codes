(defpackage "ARITHOPS"
  (:export "SUM"
           "SUB"
           "MULT"
           "DIV"))

(defun sum(x y)
  (+ x y))

(defun sub(x y)
  (- x y))

(defun mult(x y)
  (* x y))

(defun div(x y)
  (/ x y))
