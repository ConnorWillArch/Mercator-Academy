package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
driver.manage().window().maximize()


  val nameSelectorField: WebElement = driver.findElement(By.name("username"))
  val cssSelectorField: WebElement = driver.findElement(By.cssSelector("input[type=password]"))
  val tagNameSelectorField: WebElement = driver.findElement(By.tagName("textarea"))
  val idSelectorField: WebElement = driver.findElement(By.id("HTMLFormElements"))
  val xPathSelectorField: WebElement = driver.findElement(By.xpath("//tbody/tr[9]/td/input[2]"))
  val xPathSelectorField2: WebElement = driver.findElement(By.xpath("//input[@type = 'checkbox']"))
  val fullLinkSelectorLink: WebElement = driver.findElement(By.linkText("EvilTester.com"))
  val partialLinkSelectorLink: WebElement = driver.findElement(By.partialLinkText("Compendium"))


  nameSelectorField.sendKeys("Alice")
  println("Username field filled out")

  cssSelectorField.sendKeys("12345")
  println("Password field filled out")

  tagNameSelectorField.clear()
  tagNameSelectorField.sendKeys("This is a comment")
  println("Comment field filled out")

  xPathSelectorField2.click()
  println("Checkbox field clicked")




  partialLinkSelectorLink.click()
  println("Partial link clicked")


  fullLinkSelectorLink.click()
  println("Full link clicked")


  println(s"Id selector object is displayed: ${idSelectorField.isDisplayed}")

  xPathSelectorField.click()
  println("Submit button clicked")

  driver.quit()

}
