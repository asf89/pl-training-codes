import myclasspackage._

object TraitImplementation {

  def main(args: Array[String]): Unit = {
    val arg1: Int = 2
    val arg2: Int = 3
    val operations = new ArithmeticCalculator

    println(operations.sum(arg1)(arg2))
    println(operations.multiply(arg1)(arg2))

  }

}