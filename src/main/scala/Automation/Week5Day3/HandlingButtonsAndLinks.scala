package Automation.Week5Day3


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingButtonsAndLinks extends App {




  val driver: WebDriver = new ChromeDriver
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  driver.manage().window().maximize()

  val button1: WebElement = driver.findElement(By.cssSelector("[type='submit']"))


  val link1: WebElement = driver.findElement(By.linkText("Return to index"))

  if (link1.isEnabled) {
    println(s"Link text is: ${link1.getText}")
    println(s"Link url is: ${link1.getAttribute("href")}")

  }
  else {
    println("Link is not enabled")
  }

  if (button1.isEnabled) {
    println(s"Button text is: ${button1.getText}")
    button1.click()
  }
  else {
    println("Button is not enabled")
  }

  // driver.close()

  driver.quit()

}


