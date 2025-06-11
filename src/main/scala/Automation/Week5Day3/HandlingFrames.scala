package Automation.Week5Day3


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object HandlingFrames extends App {


  val driver: WebDriver = new ChromeDriver
  driver.get("https://the-internet.herokuapp.com/nested_frames")
  driver.manage().window().maximize()


  driver.switchTo().frame("frame-top")

  driver.switchTo().frame("frame-middle")
  println(s"I am currently in the ${driver.findElement(By.id("content")).getText} frame.")

  driver.switchTo().defaultContent()

  driver.switchTo().frame(driver.findElement(By.name("frame-top")))

  driver.switchTo().frame(0)
  println(s"I am currently in the ${driver.findElement(By.tagName("body")).getText} frame.")

  driver.switchTo().defaultContent()

  driver.switchTo().frame(1)
  println(s"I am currently in the ${driver.findElement(By.tagName("body")).getText} frame.")






  // driver.close()

  driver.quit()

}


