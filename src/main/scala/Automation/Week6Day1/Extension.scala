package Automation.Week6Day1


import Automation.Week5Day3.HandlingAlerts.driver
import Automation.Week6Day1.HandlingExceptions.driver
import Automation.Week6Day1.ScreenCapture.driver
import org.openqa.selenium.{Alert, By, NoSuchElementException, OutputType, TakesScreenshot, TimeoutException, WebDriver, WebElement}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.{ExpectedCondition, ExpectedConditions, Select, WebDriverWait}

import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.Date

import scala.jdk.CollectionConverters.CollectionHasAsScala

object Extension extends App {

  val options = new ChromeOptions()
  options.addArguments("--headless=new")
  val driver: WebDriver = new ChromeDriver(options)

  def takeScreenshot(status: String): Unit = {

    val dateStamp = new SimpleDateFormat("YYYY-MM-DD").format(new Date())
    val timeStamp = new SimpleDateFormat("HHmmss").format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    FileHandler.copy(srcTimestamp, new File(s"/Users/connor.archibald/Desktop/Screenshots/$dateStamp-$status-$timeStamp.png"))
    println("Screenshot saved")


  }

  def currentLastNames(): Seq[String] = {
    driver.findElements(By.cssSelector("#table1 > body > tr > td:nth-child(1)")).asScala.map(_.getText.trim).toSeq


  }

  def isSortedAsc(seq: Seq[String]): Boolean = seq == seq.sorted

  def isSortedDesc(seq: Seq[String]): Boolean = seq == seq.sorted.reverse


  try {
    driver.get("https://the-internet.herokuapp.com/tables")
    Thread.sleep(500)
    driver.manage().window().maximize()

    val lastNameHeader = driver.findElement(By.cssSelector(("#table1 > thead > tr > th:nth-child(1)")))

    val before = currentLastNames()
    println(s"Before sorting: $before")
    takeScreenshot("unsorted")

    lastNameHeader.click()
    Thread.sleep(500)

    val ascList = currentLastNames()

    println(s"Is ascending? ${isSortedAsc(ascList)}")
    takeScreenshot("ascending")

    lastNameHeader.click()
    Thread.sleep(500)

    val descList = currentLastNames()

    println(s"Is descending? ${isSortedDesc(descList)}")
    takeScreenshot("descending")

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


