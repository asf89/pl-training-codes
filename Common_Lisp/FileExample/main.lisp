(let ((in (open "hello-world.txt")))
  (when in
    (loop for line = (read-line in nil)
          while line do (format t "~a~%" line))
    (close in)
    )
 )
