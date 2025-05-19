object MonCodeAlong extends App {


  //  val total = melons + apples + fizzyDrinks

  //  var total: Double = 0
  //  val melons = 5 * 50
  //  val apples = 2 * 10
  //  val fizzyDrinks = 6 * (100 * 1.20)
  //
  //  total = total + apples
  //  println(total)
  //  total = total + melons
  //  println(total)
  //  total = total + fizzyDrinks
  //  println(total)
  //
  //  // TYPES
  //  val wholeNumber: Int = 6483
  //  val littleNumber: Short = 68
  //  val bigNumber: Long = 99999999999999999L
  //  val littleDecimal: Float = 2.3434f
  //  val decimal: Double = 2.2323
  //  val text: String = "Hello World!"
  //  val trueVal: Boolean = true
  //  val falseVal: Boolean = false
  //
  //  println(trueVal == falseVal)
  //
  //
  //  val a: Int = 10
  //  val b: Int = 5
  //  val c: Int = 3
  //
  //  val add: Int = a + b
  //  val subtract: Int = b - c
  //  val divide: Double = a / b
  //  val multiply: Int = b * c
  //  val modulus: Int = a % c
  //
  //
  //  val equality: Boolean = a == a
  //  val inequality: Boolean = a != b
  //  val lessThan: Boolean = b < a
  //  val lessThanEqual: Boolean = b <= a
  //  val greaterThan: Boolean = b > a
  //  val greaterThanEqual: Boolean = b >= a
  //
  //  val and: Boolean = true && true
  //  val or: Boolean = true || false
  //  val not: Boolean = !false
  //
  //  def makeACupOfTea(sugar: Int, milk: Boolean): String = {
  //
  //
  //    s"You have made a cup of tea with $sugar sugars and your milk selection is $milk"
  //  }
  //
  //  val cupOfTea: String = makeACupOfTea(sugar = 5, milk = true)
  //  println(cupOfTea)
  //
  //  val vat: Double = 1.2
  //
  //  def addVat(value: Double): Double = {
  //    value * vat
  //  }
  //
  //  println(addVat(20))
  //  println(addVat(30))
  //
  //  class Dog (val name:String, val age:Int, val likesBananas:Boolean) {
  //
  //    def speak:String = "woof"
  //
  //  }
  //
  //  val hella: Dog = new Dog(name = "Hella", age = 3, likesBananas = true)
  //
  //  println(hella)
  //  println(hella.likesBananas)


  //AFTERNOON TASKS

  //1.

  //A. TRUE
  val oneA: Boolean = 3 + 4 * 57 < 300
  println(oneA)

  //B. TRUE
  val oneB: Boolean = 144 / 12 >= 12
  println(oneB)

  //C. TRUE
  val oneC: Boolean = "Cat" < "Dog"
  println(oneC)

  //D. FALSE
  val oneD: Boolean = "Rabbit" < "Hamster"
  println(oneD)

  //E. TRUE
  val oneE: Boolean = 17 % 2 != 0
  println(oneE)

  //F. TRUE
  val oneF: Boolean = 75 / 9 < 30 && 89 / 6 < 20
  println(oneF)


  //2. the first `String` “I love scala already” is just a String type and does not print anything to the console.
  //   the println (“I love scala already”) is type of Unit and prints the contents to the console

  //3.
  def square(x: Int): Int = x * x

  println(square(10))

  //4.
  def isOdd(x: Int): Boolean = x % 2 != 0

  println(isOdd(19))

  //5.
  class Book(val title: String, val author: String, val publishedYear: Int) {
    def description: String = s"'$title' by $author, published in $publishedYear"

  }

  val exampleBook: Book = new Book(title = "Animal Farm", author = "George Orwell", publishedYear = 1945)
  println(exampleBook.description)

  //EXTENSION

  //1.
  val lower: String = "hello world!"
  val upper: String = lower.toUpperCase
  println(lower)
  println(upper)

  //2.
  val twoLower: String = "hello world!"
  val twoUpper: String = lower.capitalize
  println(twoLower)
  println(twoUpper)

  //3.
  val isStringEqual: Boolean = "STRING" == "string"  // false because the == is case-sensitive.

  //4. no built-in conversion that I could find
  def wordToNumForOne(word:String) : Int = {

    val number: Int = if (word == "one") 1 else 0
    number
  }
  println(wordToNumForOne("one"))
  println(wordToNumForOne("two"))

  //5. no built-in conversion that I could find
  def numToWordForOne(num:Int) : String = {

    val number: String = if (num == 1) "one" else "none"
    number
  }
  println(numToWordForOne(1))
  println(numToWordForOne(2))

  //6. Yes it is built-in
  val numToConvert: Int = 1
  val convertedNum: String = numToConvert.toString // will be "1"
  println(numToConvert)
  println(convertedNum)

  //RESEARCH

  //1. It will not compile because it is one of Scala's reserved keywords

  //2. you could write it as:
  val `new`: String = "test"
  println(`new`)
// there are a lot of reserved keywords like if, else, true and so on.

  //3. As far as I can understand a case class you won't need to add the val on each of the params and it also comes with a few built-in
  // functions so you would use it for most basic classes and only use the plain class when you need more control.

}
