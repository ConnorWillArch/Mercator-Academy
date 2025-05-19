object MonCodeAlong extends App {


  //  val total = melons + apples + fizzyDrinks

  var total: Double = 0
  val melons = 5 * 50
  val apples = 2 * 10
  val fizzyDrinks = 6 * (100 * 1.20)

  total = total + apples
  println(total)
  total = total + melons
  println(total)
  total = total + fizzyDrinks
  println(total)

  // TYPES
  val wholeNumber: Int = 6483
  val littleNumber: Short = 68
  val bigNumber: Long = 99999999999999999L
  val littleDecimal: Float = 2.3434f
  val decimal: Double = 2.2323
  val text: String = "Hello World!"
  val trueVal: Boolean = true
  val falseVal: Boolean = false

  println(trueVal == falseVal)


  val a: Int = 10
  val b: Int = 5
  val c: Int = 3

  val add: Int = a + b
  val subtract: Int = b - c
  val divide: Double = a / b
  val multiply: Int = b * c
  val modulus: Int = a % c


  val equality: Boolean = a == a
  val inequality: Boolean = a != b
  val lessThan: Boolean = b < a
  val lessThanEqual: Boolean = b <= a
  val greaterThan: Boolean = b > a
  val greaterThanEqual: Boolean = b >= a

  val and: Boolean = true && true
  val or: Boolean = true || false
  val not: Boolean = !false

  def makeACupOfTea(sugar: Int, milk: Boolean): String = {


    s"You have made a cup of tea with $sugar sugars and your milk selection is $milk"
  }

  val cupOfTea: String = makeACupOfTea(sugar = 5, milk = true)
  println(cupOfTea)

  val vat: Double = 1.2

  def addVat(value: Double): Double = {
    value * vat
  }

  println(addVat(20))
  println(addVat(30))

  class Dog (val name:String, val age:Int, val likesBananas:Boolean) {

    def speak:String = "woof"

  }

  val hella: Dog = new Dog(name = "Hella", age = 3, likesBananas = true)

  println(hella)
  println(hella.likesBananas)


}
