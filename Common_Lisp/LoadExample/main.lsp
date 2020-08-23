(load "arithmetic/sum.lsp")
(load "arithmetic/sub.lsp")
(load "arithmetic/mult.lsp")
(load "arithmetic/div.lsp")

(defvar x 20)
(defvar y 10)

(format t "Sum: ~D~%" (sum.sum x y))
(format t "Subtraction: ~D~%" (sub.sub x y))
(format t "Multiplication: ~D~%" (mult.mult x y))
(format t "Division: ~D~%" (div.div x y))
