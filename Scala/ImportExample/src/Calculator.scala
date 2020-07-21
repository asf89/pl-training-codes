import mypackage.Arithmetic

object Calculator {
  def main(args: Array[String]): Unit = {
    val operations = new Arithmetic
    println(operations.sum(3)(2))
    println(operations.subtract(3)(2))
  }
}