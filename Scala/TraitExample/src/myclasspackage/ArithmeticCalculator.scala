package myclasspackage

import mytraitpackage.ArithmeticTrait

class ArithmeticCalculator extends ArithmeticTrait {

  override def sum(arg1:Int)(arg2:Int): Int = arg1 + arg2
  override def multiply(arg1:Int)(arg2:Int): Int = arg1 * arg2

}