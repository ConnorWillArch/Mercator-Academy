package Automation.Week5Day2


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  driver.manage().window().maximize()


  val nameSelectorField: WebElement = driver.findElement(By.name("username"))
  val cssSelectorField: WebElement = driver.findElement(By.cssSelector("input[type=password]"))
  val tagNameSelectorField: WebElement = driver.findElement(By.tagName("textarea"))


  //  driver.quit()

}
