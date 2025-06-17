package Automation.Week6Day1

import Automation.Week6Day1.HandlingHeadlessMode.{driver, options}
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.io.FileHandler

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date



object ScreenCapture extends App {
  val driver: WebDriver = new ChromeDriver()
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")


  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)

  FileHandler.copy(srcFull, new File("/Users/connor.archibald/Desktop/Screenshots/TestResult.png"))

  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/connor.archibald/Desktop/Screenshots/TestResult_$timeStamp.png"))


  val element = driver.findElement(By.name("my-disabled"))

  val srcElement: File = element.getScreenshotAs(OutputType.FILE)

  FileHandler.copy(srcElement, new File("/Users/connor.archibald/Desktop/Screenshots/TestResult_Specific.png"))


  driver.quit()
}
