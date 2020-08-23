<<<<<<< HEAD
(defpackage :arith-ops
  (:use :cl :math-ops)  
)
(in-package :arith-ops)
=======
(defpackage #:arith-ops
  (:use #:cl #:math-ops)  
)
(in-package #:arith-ops)
>>>>>>> fb3dca9ff99e0a476bf4c8d374382efd98c6a946

(format t "Multiplication: ~D~%" (math-ops:mult 3 5))
;; blah blah blah.
