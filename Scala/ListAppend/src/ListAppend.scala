object ListAppend extends App {

  val list = List("a", "b", "c")
  val getHead = list.head
  val finalList = list :+ getHead

/* Outra forma:
  val finalList = list :+ list(0)
 */

  finalList.foreach(println)
}