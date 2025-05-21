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

  try{
    val number = "one".toInt
    println(s"The number is $number")
  } catch{
    case e: Exception => println(s"$e was not a valid input")

  }






}


