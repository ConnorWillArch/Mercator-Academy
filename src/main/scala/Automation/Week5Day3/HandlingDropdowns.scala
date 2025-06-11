package Automation.Week5Day3


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object HandlingDropdowns extends App {


  val driver: WebDriver = new ChromeDriver
  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")
  driver.manage().window().maximize()
driver.switchTo().frame("iframeResult")
  val dropdownSelect: Select = new Select(driver.findElement(By.id("cars")))

  dropdownSelect.selectByVisibleText("Saab")
println(s"Selected by visible text: ${dropdownSelect.getFirstSelectedOption.getText}")

  dropdownSelect.selectByValue("Saab")
  println(s"Selected by value: ${dropdownSelect.getFirstSelectedOption.getText}")

  dropdownSelect.selectByIndex(3)
  println(s"Selected by index ${dropdownSelect.getFirstSelectedOption.getText}")

  // driver.close()

   driver.quit()

}


