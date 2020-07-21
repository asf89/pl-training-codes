import Number.Number

object GetterSetter {

  def main(args: Array[String]): Unit = {

    val test1 = new Number
    println(s"test1 value (num1): ${test1.num1}")
    println(s"test1 value (num2): ${test1.num2}")
    println(s"test1 value (num3): ${test1.num3}")

    val test2 = new Number(2, 5)
    println(s"test2 value (num1): ${test2.num1}")
    println(s"test2 value (num2): ${test2.num2}")

    test1.num1_=(6)
    test1.num2_=(8)

    println(s"test1 new value (num1): ${test1.num1}")
    println(s"test1 new value (num2): ${test1.num2}")

  }
}