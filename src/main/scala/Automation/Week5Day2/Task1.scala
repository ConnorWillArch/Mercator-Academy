package Automation.Week5Day2


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task1 extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://demoqa.com/browser-windows")

  println(s"The page title is ${driver.getTitle}")
  println(s"The current url is ${driver.getCurrentUrl}")




  // driver.close()

  driver.quit()

}

