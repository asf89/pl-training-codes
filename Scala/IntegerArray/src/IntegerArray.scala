object IntegerArray extends App {
  val minRange: Int = 1
  val maxRange: Int = 5
  val arrayOfIntegers = Array.range(minRange, maxRange)
  val tripleArray = arrayOfIntegers.map(_ * 3)
  val finalArray = tripleArray.filter(_ % 2 == 0)

  finalArray.foreach(println)

}