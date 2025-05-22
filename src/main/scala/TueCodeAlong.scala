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


  val toAdd: Seq[Int] = Seq(1, 1, 1)

  val addedToEnd = firstSeq :+ toAdd
  val addedToEndNew: Seq[Int] = firstSeq ++ toAdd

  println("Append with :+ " + addedToEnd)
  println("Append with ++ " + addedToEndNew)

  val addedToStart = toAdd +: firstSeq
  val addedToStartNew: Seq[Int] = toAdd ++ firstSeq

  println("Prepend with +: " + addedToStart)
  println("Prepend with ++ " + addedToStartNew)

  println(addedToStart)


  //EXERCISES

  //1.
  val submissions: Seq[String] = Seq("Alice", "Bob", "Alice", "Charlie", "Bob", "David", "Alice")

  //2.
  println(s"All submissions: ${submissions.mkString(", ")}")

  //3.
  def countSubmissions(taxpayers: Seq[String], name: String): Int = {
    taxpayers.count(_ == name)
  }


  //4.
  val nameToBeChecked: String = "Bob"
  println(s"Number of Submissions for $nameToBeChecked: " + countSubmissions(submissions, nameToBeChecked))

  //5.
  val uniqueTaxPayers: Set[String] = submissions.toSet

  //6.
  println(s"Unique submissions: ${uniqueTaxPayers.mkString(", ")}")

  //7.
  def countSubmissionsUniversal[T](collection: Iterable[T], itemToCount: T): Int = {
    collection.count(_ == itemToCount)
  }

  //8.
  val nameToBeCheckedNew: String = "Alice"
  println(s"Number of Submissions for $nameToBeCheckedNew: " + countSubmissionsUniversal(submissions, nameToBeCheckedNew))
  println(s"Number of Submissions for $nameToBeCheckedNew: " + countSubmissionsUniversal(uniqueTaxPayers, nameToBeCheckedNew))

  //9.

  //a.
  val failed: Map[String, Int] = Map(
    "Alice" -> 1,
    "Bob" -> 2,
    "Charlie" -> 0,
    "David" -> 4,
    "Ben" -> 6
  )

  //b.
  val user0: String = failed.keys.toSeq.head
  println(s"User at index 0 $user0 number of failed attempts ${failed(user0)}")

  //c.
  val withGrace: Map[String, Int] = failed + ("Grace" -> 3)
  println(s"Map with Grace $withGrace")


  //d.
  val user1: String = withGrace.keys.toSeq(1)
  val updated1: Map[String, Int] = withGrace.updated(user1, withGrace(user1) + 1)
  println(s"Map with first update $updated1")

  //e.
  val user5: String = updated1.keys.toSeq(5)
  val updated2: Map[String, Int] = updated1 - user5
  println(s"Map with second update $updated2")


  // EXTENSION
  val dayOneSet: Set[String] = Set("Alice", "Bob", "Charlie", "David")
  val dayOTwoSet: Set[String] = Set("Alice", "Bob", "Charlie", "Eve", "Frank")

  //a.
  val bothDays: Set[String] = dayOneSet.intersect(dayOTwoSet)
  println(s"Submitted on both days ${bothDays.mkString(", ")}")

  //b.
  val day1: Set[String] = dayOneSet diff dayOTwoSet
  val day2: Set[String] = dayOTwoSet diff dayOneSet
  println(s"Submitted only on first day ${day1.mkString(", ")}")
  println(s"Submitted only on second day ${day2.mkString(", ")}")

  //c.
  val allUnique: Set[String] = dayOneSet union dayOTwoSet
  println(s"All unique submissions ${allUnique.mkString(", ")}")
}
