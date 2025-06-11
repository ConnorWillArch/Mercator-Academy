package Automation.Week5Day3


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingRadioButtonsAndCheckboxes extends App {




  val driver: WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  driver.manage().window().maximize()

  val radioButton1: WebElement = driver.findElement(By.cssSelector("[type='submit']"))




  // driver.close()

  driver.quit()

}


