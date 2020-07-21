object ControlStructures extends App {

// Reads an integer from keyboard and tells if the student passed or failed
  val percentage = scala.io.StdIn.readInt()
  val result =
    if (percentage >= 60) "pass"
    else "fail"
  println(result)

// Example using 'while' loop
  var temperature: Int = 300
  val temperatureLimit: Int = 375
  var count: Int = 0

  while (temperature < temperatureLimit) {
    temperature += 25
    count += 1
  }

  println(count)

// Example using 'for' expression
  val testArray: Array[Int] = Array(1,2,3,4,5)
  val squareArray: Array[Int] =
    for (square <- testArray)
      yield square * square

  for (newArray <- squareArray)
    println(newArray)

/* Another way;
  val testArray = Array(1,2,3)

  for (i <- 0 until testArray.length) {
    testArray(i) = testArray(i) * testArray(i)
  }

  testArray.foreach(println)
 */

// Example using 'match'
  val testVariable: String = "blue"

  testVariable match {
    case "blue" => println("orange")
    case "yellow" => println("purple")
    case "red" => println("green")
    case _ => println("not a primary color.")
  }
}