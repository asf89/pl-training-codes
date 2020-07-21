object StringInterpolation extends App {

  //String Interpolation using 's'
  val name: String = "André"
  val age = 30

  println(s"$name tem $age anos de idade.")

  //String Interpolation using 'f'
  val num1: Double = 7
  val num2 = 3D
  val quotient : Double = num1 / num2

  println(f"The quotient is $quotient%.3f")

  //String Interpolation using 'raw'
  println("Without Raw: \nFirst\nSecond")
  println(raw"With Raw: \nFirst\nSecond")
}