package Number

class Number(private var _num1: Int = 0, private var _num2: Int = 0) {

  //Defining Getter:
  def num1: Int = _num1

  //Defining Setter:
  def num1_=(newValue: Int): Unit = {
    _num1 = newValue
  }

  def num2: Int = _num2
  def num2_=(newValue: Int): Unit = {
    _num2 = newValue
  }

  var num3: Int = 8
}