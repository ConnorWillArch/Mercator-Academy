package Automation.Week5Day2


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object BrowserMethods extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  driver.manage().window().maximize()

  driver.navigate().to("https://the-internet.herokuapp.com")

  driver.navigate().back()

  driver.navigate().forward()

  driver.navigate().refresh()

  driver.close()

  //  driver.quit()

}
