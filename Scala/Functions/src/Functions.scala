import scala.annotation.tailrec

object Functions extends App {

// Example of defining a function:
  def absolute(x:Double): Double = {
    if (x < 0) -x else x
  }

  val input = -5
  println(absolute(input))

// Example of recursive function

  def sum(numberList:List[Int]): Int = numberList match {
    case List() => 0
    case numberList => numberList.head + sum(numberList.tail)
  }
/* Another form:
  def sum(numberList:List[Int]): Int = numberList match {
    case Nil => 0
    case x::tail => x + sum(tail)
  }
*/
  val numberList: List[Int] = List(1,2,3,4,5)
  println(sum(numberList))

/* Alternative solution:
  def sum(numberList:List[Int], index:Int): Int = {
    if (index < 0) 0
    else numberList(index) + sum(numberList, index - 1)
  }

  val list = List(1,2,3,4,5)
  println(sum(list,4))
 */

// Example of nested function:
  def mainMax(a:Int, b:Int, c:Int): Int = {
    def max(x:Int, y:Int): Int =  {
      if (x > y) x else y
    }

    max(a,max(b,c))
  }

  println(mainMax(1,5,9))

// Example of tail recursive function
  def factorial(x:Int):Int = {
    @tailrec def loop(accumulator:Int, x:Int): Int = {
      if (x == 0) accumulator else loop (accumulator * x, x - 1)
    }

    loop(1,x)
  }

  print(factorial(4))
}