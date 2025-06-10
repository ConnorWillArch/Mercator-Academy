package Automation.Week5Day2


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task2 extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://demoqa.com/automation-practice-form")

  driver.navigate().to("https://example.com")
  driver.navigate().back()
  driver.navigate().forward()
  driver.navigate().refresh()

  driver.manage().window().minimize()
  driver.manage().window().maximize()




  println(s"The is part of the page source ${driver.getPageSource.take(30)}")





  // driver.close()

   driver.quit()

}

