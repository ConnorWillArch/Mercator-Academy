package Automation.Week5Day3


import org.openqa.selenium.{Alert, By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

object HandlingWindows extends App {


  val driver: WebDriver = new ChromeDriver
  driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val parentWindow: String = driver.getWindowHandle
  println(s"Handle for parent window is ${parentWindow}")

  driver.findElement(By.linkText("Click Here")).click()


  val allWindows: List[String] = driver.getWindowHandles.toList
  val it = allWindows.iterator

  while (it.hasNext) {
    val handle = it.next()


    if (handle != parentWindow) {
      driver.switchTo().window(handle)
         println(s"The current window is ${handle}")
         println(s"The current page title is ${driver.getTitle}")
    }


  }







  // driver.close()

  driver.quit()

}


