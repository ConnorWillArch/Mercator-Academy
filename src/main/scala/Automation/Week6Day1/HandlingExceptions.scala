package Automation.Week6Day1


import Automation.Week4Day4.ByID.driver
import Automation.Week5Day3.HandlingAlerts.driver
import org.openqa.selenium.{Alert, By, WebDriver, WebElement, NoSuchElementException}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.support.ui.Select

object HandlingExceptions extends App {


  val driver: WebDriver = new ChromeDriver()


  try {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html")
    driver.manage().window().maximize()
    val invalidElement: WebElement = driver.findElement(By.id("random"))
  }
  catch {
    case _: NoSuchElementException =>
      println(s"No such Element")


    case e: Exception =>
      println(s"Print any exception ${e.getMessage}")
  }


  finally {

    if (driver != null) {
      driver.quit()

    }


  }


}


