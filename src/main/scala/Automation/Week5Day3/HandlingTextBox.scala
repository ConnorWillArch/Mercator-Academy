package Automation.Week5Day3


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingTextBox extends App {




  val driver: WebDriver = new ChromeDriver
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  driver.manage().window().maximize()

 val textInput: WebElement = driver.findElement(By.id("my-text-id"))

  textInput.sendKeys("Welcome")
  println("The value has been entered")
  println(s"This is the value '${textInput.getAttribute("value")}'")
  textInput.clear()
  println("The value has been cleared")








  // driver.close()

  driver.quit()

}


