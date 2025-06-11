package Automation.Week5Day3


import org.openqa.selenium.{Alert, By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

object HandlingAlerts extends App {


  val driver: WebDriver = new ChromeDriver
  driver.get("https://the-internet.herokuapp.com/javascript_alerts")
  driver.manage().window().maximize()

  driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click()

  val simpleAlert: Alert = driver.switchTo().alert()
  println(s"The simple alert text is ${simpleAlert.getText}")
  simpleAlert.accept()

  driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click()

  val simpleConfirm: Alert = driver.switchTo().alert()
  println(s"The confirmation alert text is ${simpleConfirm.getText}")
  simpleConfirm.dismiss()

  driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click()

  val simplePrompt: Alert = driver.switchTo().alert()
  println(s"The prompt alert text is ${simplePrompt.getText}")
  simplePrompt.sendKeys("test")
  simplePrompt.accept()








  // driver.close()

  driver.quit()

}


