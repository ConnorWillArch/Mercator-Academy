package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object ByID extends App {

  val driver: WebDriver = new ChromeDriver()

  println("Invoking Chrome Browser")

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")
  driver.manage().window().maximize()
  val emailAddress: WebElement = driver.findElement(By.id("email"))
  emailAddress.sendKeys("example@example.com")


  val passwordField: WebElement = driver.findElement(By.id("password"))
  passwordField.sendKeys("pass1234")

  val submitButton: WebElement = driver.findElement(By.id("login"))
  submitButton.click()

  driver.quit()

}
