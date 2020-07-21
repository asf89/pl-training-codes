object Temperature extends App {
  val fahrenheit = 50F // 'F' stands for "Float" and 'D' stands for "Double"
  val celsius = ((fahrenheit - 32) * 5F) / 9F

  println(celsius)
}