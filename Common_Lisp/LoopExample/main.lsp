(defun sum(x i)
  (if (= x 0)
    i
    (sum (- x 1) (+ i x)))
 )

(format t "Sum of ~D: ~D~%" 5 (sum 5 0))
