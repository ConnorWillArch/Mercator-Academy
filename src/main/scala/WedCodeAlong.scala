object WedCodeAlong extends App {

  val weather: String = "hot"

  //  if (weather == "sunny") {
  //    println("Don't wear a coat")
  //  }
  //  else if (weather == "rainy") {
  //    println("Take a coat")
  //  }
  //  else if (weather == "cold") {
  //    println("Take a warm coat")
  //  } else {
  //    println("Not a valid weather option")
  //  }

  weather match {
    case "rainy" => println("Take a coat")
    case "sunny" => println("Don't wear a coat")
    case "cold" => println("Take a warm coat")
    case _ => println("Not a valid weather option")
  }


  val season: String = "spring"

  if (weather == "cold" || season == "winter") {
    println("Take a coat")
  } else {
    println("A light jacket is fine")
  }

  (weather, season) match {
    case (weather, season) if weather == "cold" || season == "winter" => println("Take a coat")
    case _ => println("A light jacket is fine")
  }

  val age: Int = 0

  if (age >= 18) {
    println(s"You are an adult because you are $age")
  }
  else if (age >= 0 && age < 18) {
    println(s"You are a child because you are $age")
  }
  else {
    println(s"You don't exist yet")
  }

  age match {
    case age if age >= 18 => println(s"You are an adult because you are $age")
    case age if age >= 0 && age < 18 => println(s"You are a child because you are $age")
    case _ => println(s"You don't exist yet")
  }

  // TASK 1
  val score: Int = 101

  if (score < 0) {
    println("Invalid")
  } else if (score < 50) {
    println("You get an F")
  }
  else if (score < 60) {
    println("You get an E")
  }
  else if (score < 70) {
    println("You get an D")
  }
  else if (score < 80) {
    println("You get an C")
  }
  else if (score < 90) {
    println("You get an B")
  }
  else if (score >= 90 && score <= 100) {
    println("You get an A")
  }
  else if (score > 100) {
    println("You are a genius")
  }


  //TASK 2
  val viewingAge: Int = 12

  viewingAge match {
    case age if age < 4 => println("Please enter an age above 3")
    case age if age < 8 => println("Rating is U")
    case age if age < 12 => println("Rating is PG")
    case age if age < 15 => println("Rating is 12A")
    case age if age < 18 => println("Rating is 15")
    case age if age >= 18 => println("Rating is 18")
    case _ => println("Please enter valid age")

  }


  val name: Option[String] = Some("Bob")
  val emptyName: Option[String] = None

  println(name)
  println(emptyName)

  //getOrElse is used when we want a default value if  None is returned and it will take the Some() away leaving us with just the value
  def getName(name: Option[String]): String = name.getOrElse("This user has left the field empty")

  println(getName(name))
  println(getName(emptyName))

  try {
    val number = "one".toInt
    println(s"The number is $number")
  } catch {
    case e: Exception => println(s"$e was not a valid input")

  }

  // EXERCISES

  //1.
  val numberOfMelons: Int = 6
  val hasBag: Boolean = false

  if (numberOfMelons <= 0) {
    println(s"$numberOfMelons is not a valid number of watermelons")
  } else {
    val message: String = if (numberOfMelons <= 3 && !hasBag)
      s"You don't need a bag to carry $numberOfMelons watermelons"
    else if (numberOfMelons <= 3 && hasBag)
      s"You have a bag but you could carry $numberOfMelons watermelons without it"
    else if (numberOfMelons <= 5 && hasBag)
      s"You have a bag which is needed to carry $numberOfMelons watermelons"
    else if (numberOfMelons <= 5 && !hasBag)
      s"You can't carry $numberOfMelons watermelons without a bag"
    else
      s"You can't carry $numberOfMelons watermelons"

    println(message)

    val maxCarry: Int = if (hasBag) 5 else 3
    if(numberOfMelons <= maxCarry){
      println(s"Yes you can buy $numberOfMelons watermelons")
    }
    else{
      println(s"No you can't buy $numberOfMelons watermelons")
    }

  }

  //2.
  def calculatePay(input: String): String={
    try {
      val miles: Double = input.toDouble
      if(miles < 0){
        throw new Exception(s"$miles")
      }
      val pay:Double = miles * 0.45
      s"for $miles you get payed £$pay"
    } catch{
      case e: Exception => s"$e is not a valid input please use a number above 0"
    }
  }
  println(calculatePay("14"))
  println(calculatePay("ten"))

  //EXTENSION

  //1.
  // Order: (high -> low): *, /, %, +, -, :, <, >, =, !, &, ^, |, (letters), $, _

  //2.
  val test1: Boolean = (true || false && false) //TRUE
  println("Test1: " + test1)

  //3.
  val test2: Boolean = ((true || false) && false) //FALSE
  println("Test2: " + test1)

  //4.
  val test3: Boolean = (1 < 4 && 7 != 10 || 9 + 10 == 21) //TRUE
  println("Test3: " + test1)


  //RESEARCH

  //1.
  val first: Int = 2
  val second: Int = 3

  //2.
  val answer: String =
    if(first > second) "yes"
    else "no"

  println(s"First > Second: $answer")
}


