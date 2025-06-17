package Automation.Week6Day1


import Automation.Week4Day4.ByID.driver
import Automation.Week5Day3.HandlingAlerts.driver
import org.openqa.selenium.{Alert, By, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.support.ui.Select

object Exception1 extends App {

  val options = new ChromeOptions()
  options.addArguments("--headless")
  val driver: WebDriver = new ChromeDriver(options)
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  driver.manage().window().maximize()
  val invalidElement: WebElement = driver.findElement(By.id("random"))






  // driver.close()

  //driver.quit()

}


