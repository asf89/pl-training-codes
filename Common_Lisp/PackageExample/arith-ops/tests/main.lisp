(defpackage arith-ops/tests/main
  (:use :cl
        :arith-ops
        :rove))
(in-package :arith-ops/tests/main)

;; NOTE: To run this test file, execute `(asdf:test-system :arith-ops)' in your Lisp.

(deftest test-target-1
  (testing "should (= 1 1) to be true"
    (ok (= 1 1))))
