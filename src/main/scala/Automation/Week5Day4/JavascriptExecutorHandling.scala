package Automation.Week5Day3


import org.openqa.selenium.{Alert, By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

import java.time.Duration


object JavascriptExecutorHandling extends App {


  val driver: WebDriver = new ChromeDriver

  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")
  driver.manage().window().maximize()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4))


  val emailAddress: WebElement = driver.findElement(By.id("email"))
  emailAddress.sendKeys("example@example.com")
  assert(emailAddress.getAttribute("value") == "example@example.com")

  val passwordField: WebElement = driver.findElement(By.id("password"))
  passwordField.sendKeys("pass1234")


  val submitButton: WebElement = driver.findElement(By.id("login"))


  val js = driver.asInstanceOf[JavascriptExecutor]
  js.executeScript("arguments[0].scrollIntoView(true);", submitButton)
  js.executeScript("arguments[0].click();", submitButton)

  println("Login successful")

val header = driver.findElement(By.tagName("h2"))
  assert(header.getText == "Thank You!")


  // driver.close()

  driver.quit()

}


