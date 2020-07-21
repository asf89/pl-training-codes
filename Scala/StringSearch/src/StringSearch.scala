object StringSearch extends App {

  val stringToFindExpression: String = "The car is red."
  val expressionToFind = "[a-z]{3}".r

  var match1 = expressionToFind.findFirstIn(stringToFindExpression)

  match1.foreach(println)

}