package Automation.Week6Day1


import Automation.Week5Day3.HandlingAlerts.driver
import Automation.Week6Day1.HandlingExceptions.driver
import Automation.Week6Day1.ScreenCapture.driver
import org.openqa.selenium.{Alert, By, NoSuchElementException,TimeoutException, OutputType, TakesScreenshot, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.{ExpectedCondition, ExpectedConditions, Select, WebDriverWait}

import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.Date

object Task extends App {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")
  val driver: WebDriver = new ChromeDriver(options)

  def takeScreenshot(status: String): Unit ={

    val dateStamp = new SimpleDateFormat("YYYY-MM-DD").format(new Date())
    val timeStamp = new SimpleDateFormat("HHmmss").format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"/Users/connor.archibald/Desktop/Screenshots/$dateStamp-$status-$timeStamp.png"))
    println("Screenshot saved")


  }


  try {
    driver.get("https://the-internet.herokuapp.com/login")
    driver.manage().window().maximize()

    driver.findElement(By.id("username")).sendKeys("tomsmith")
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!")

    driver.findElement(By.cssSelector("button[type='submit']")).click()

    val wait = new WebDriverWait(driver, Duration.ofSeconds(10))
    val flash = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")))
    val msg = flash.getText

    println(s"Login message: ${msg.trim}")

    if(msg.contains("secure area")){
      takeScreenshot("success")
    } else takeScreenshot("failure")

  }
  catch {
    case _: NoSuchElementException =>
      println(s"No such Element")

    case _: TimeoutException =>
      println(s"Wait has timed out")


    case e: Exception =>
      println(s"Print any exception ${e.getMessage}")
  }


  finally {

    if (driver != null) {
      driver.quit()

    }


  }


}


