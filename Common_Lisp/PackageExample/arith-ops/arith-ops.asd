(defsystem "arith-ops"
  :version "0.1.0"
  :author ""
  :license ""
  :depends-on ()
  :components ((:module "math-ops"
                :components
                ((:file "package")
                 (:file "arithmetic")))
               (:module "src"
                :components
                ((:file "main"))))
  :description ""
  :in-order-to ((test-op (test-op "arith-ops/tests"))))

(defsystem "arith-ops/tests"
  :author ""
  :license ""
  :depends-on ("arith-ops"
               "rove")
  :components ((:module "tests"
                :components
                ((:file "main"))))
  :description "Test system for arith-ops"
  :perform (test-op (op c) (symbol-call :rove :run c)))
