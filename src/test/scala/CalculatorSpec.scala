import org.scalatest.flatspec.AnyFlatSpec

class CalculatorSpec extends AnyFlatSpec {

  val calc: Calculator = new Calculator

  "add" should "add two numbers" in {
    val input = calc.add(5, 6)
    val expectedResult: Int = 11
    assert(input == expectedResult)

  }
  "multiply" should "multiply two numbers" in {
    val input = calc.multiply(2, 3)
    val expectedResult: Int = 6
    assert(input == expectedResult)

  }
  "subtract" should "subtract number 2 from number 1" in {
    val input = calc.subtract(5, 1)
    val expectedResult: Int = 4
    assert(input == expectedResult)

  }
  "divide" should "divide number 1 by number 2" in {
    val input = calc.divide(6, 2)
    val expectedResult: Int = 3
    assert(input == expectedResult)

  }


}
