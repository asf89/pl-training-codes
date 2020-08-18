(defun pow2(x)
  (* x x))

(let ((y 2))
  (format t "~D~%" (pow2 y))
 )

(defparameter *input* 4)

(format t "~D~%" (pow2 *input*))
