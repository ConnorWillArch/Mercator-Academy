object TueCodeAlong extends App {

  //COLLECTIONS

  val firstSet: Set[Int] = Set(1, 2, 3, 4, 5, 5)
  val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 5)
  val firstMap: Map[String, Int] = Map(

    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "four" -> 4,
    "five" -> 5

  )


  println("First set " + firstSet)
  println("First seq " + firstSeq)
  println("First map " + firstMap)

  //ACCESSING DATA
  val getSeqHead: Int = firstSeq.head
  val getSeqTail: Seq[Int] = firstSeq.tail
  val getSeqIndex: Int = firstSeq(3)

  val getSetIndex: Boolean = firstSet(3)
  val filteredSet: Set[Int] = firstSet.filter(_ < 3)
  val filteredNotSet: Set[Int] = firstSet.filterNot(_ < 3)
  val filteredEvenSet: Set[Int] = firstSet.filter(_ % 2 == 0)

  val getMapValueWithKey: Int = firstMap("one")
  val getMapKeyWithValue: String = firstMap.find(_._2 == 2).get._1

  println("First seq head " + getSeqHead)
  println("First seq tail " + getSeqTail)
  println("First seq index " + getSeqIndex)

  println("First set check " + getSetIndex)
  println("Filtered set small " + filteredSet)
  println("FilteredNot set small " + filteredNotSet)
  println("Even set " + filteredEvenSet)

  println("Get map value with key " + getMapValueWithKey)
  println("Get map key with value " + getMapKeyWithValue)

  //TASK

  val secondSeq: Seq[String] = Seq("bob", "john", "ron", "ben")
  val secondMap: Map[Int, String] = Map(

    1 -> "red",
    2 -> "yellow",
    3 -> "blue",
    4 -> "green"


  )
  val mapColourBlue: Map[Int, String] = secondMap.filter(_._2 == "blue")
  val higherValuesSet: Set[Int] = firstSet.filter(_ > 2)

  println("second Seq " + secondSeq)
  println("Map Colour Blue " + mapColourBlue)
  println("High Value Set " + higherValuesSet)


  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map {
    _ * 3
  }

  def tripledSeq(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map {
    _ * 3
  }

  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map {
    case (key, value) => (key, value * 3)
  }

  def addSet(inputSet: Set[Int]): Set[Int] = inputSet.map {
    _ + 1
  }

  val conatainsLetterR: Boolean = secondSeq.exists(name => name.contains('r'))

  val oddSet: Set[Int] = firstSet.filter(_ % 2 != 0)

  println("Tripled set " + tripledSet(firstSet))
  println("Add set " + addSet(firstSet))
  println("Odd set " + oddSet)
  println("Tripled seq " + tripledSeq(firstSeq))
  println("Contains R " + conatainsLetterR)
  println("Tripled Map " + tripledMap(firstMap))

  val flatMapNames = secondSeq.flatMap(_.toUpperCase)
  println("flat mapped to characters " + flatMapNames)



  val toAdd: Seq[Int] = Seq(1,1,1)

  val addedToEnd = firstSeq :+ toAdd
  val addedToEndNew: Seq[Int] = firstSeq ++ toAdd

  println("Append with :+ " + addedToEnd)
  println("Append with ++ " + addedToEndNew)

  val addedToStart = toAdd +: firstSeq
  val addedToStartNew: Seq[Int] = toAdd ++ firstSeq

  println("Prepend with +: " + addedToStart)
  println("Prepend with ++ " + addedToStartNew)

  println(addedToStart.flatMap(_+"1"))
}
