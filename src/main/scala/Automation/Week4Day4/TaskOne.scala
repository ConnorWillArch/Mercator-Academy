package Automation.Week4Day4

import Automation.Week4Day4.ByID.driver
import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object TaskOne extends App {
  val driver: WebDriver = new ChromeDriver()

  println("Invoking Chrome Browser")

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  driver.manage().window().maximize()

  val nameField: WebElement = driver.findElement(By.id("my-text-id"))
  nameField.sendKeys("Alice")

  val passwordField: WebElement = driver.findElement(By.name("my-password"))
  passwordField.sendKeys("12345")

  val commentArea: WebElement = driver.findElement(By.name("my-textarea"))
  commentArea.sendKeys("This is a test comment")

  val inputs: java.util.List[WebElement] = driver.findElements(By.tagName("input"))
  println(s"Number of input tags is ${inputs.size()}")

  val fullLink: WebElement = driver.findElement(By.linkText("Return to index"))
  fullLink.click()
  println(driver.getTitle)
  driver.navigate().back()
  println(driver.getTitle)
  val partialLink: WebElement = driver.findElement(By.partialLinkText("Return"))
  partialLink.click()

  driver.quit()


}
