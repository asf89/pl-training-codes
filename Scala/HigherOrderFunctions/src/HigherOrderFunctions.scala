object HigherOrderFunctions extends App {

// Example of higher-order function
  def arithmeticPrinter(arithmeticFunction: (Int,Int) => Int, int1:Int, int2:Int): Unit = {
    println(arithmeticFunction(int1, int2))
  }

  def add(a:Int, b:Int): Int = a + b
  def subtract(a:Int, b:Int): Int = a - b
  def multiply(a:Int, b:Int): Int = a * b
  def divide(a:Int, b:Int): Int = a / b

  val a: Int = 10
  val b: Int = 2

  arithmeticPrinter(add, a, b)
  arithmeticPrinter(subtract, a, b)
  arithmeticPrinter(multiply, a, b)
  arithmeticPrinter(divide, a, b)

// Example using anonymous functions
  def printAdd(x:Int, y:Int): Unit = arithmeticPrinter( (x,y) => x + y, x, y)
  def printSubtract(x:Int, y:Int): Unit = arithmeticPrinter((x,y) => x - y, x, y)

  val x: Int = 6
  val y: Int = 4

  printAdd(x, y)
  printSubtract(x, y)

//Example using curried functions
  def product(f: Int => Int)(a:Int, b:Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  def fact(n:Int): Int = {
    product(x => x)(1, n)
  }

  println(fact(5))
}