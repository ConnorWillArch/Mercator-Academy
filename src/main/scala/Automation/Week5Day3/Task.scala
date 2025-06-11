package Automation.Week5Day3

import org.openqa.selenium.{Alert, By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{Select, WebDriverWait}

import java.time.Duration

object Task extends App {

  val driver: WebDriver = new ChromeDriver
  driver.get("https://testpages.herokuapp.com/styled/index.html")
  driver.manage().window().maximize()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4))

  driver.findElement(By.linkText("HTML Form Example")).click()

  val username: WebElement = driver.findElement(By.name("username"))
  username.sendKeys("Alice")


  val password: WebElement = driver.findElement(By.name("password"))
  password.sendKeys("12345")

  val checkbox1: WebElement = driver.findElement(By.cssSelector("tbody > tr:nth-child(5) > td > input[type=checkbox]:nth-child(2)"))

  if (checkbox1.isDisplayed && checkbox1.isEnabled && !checkbox1.isSelected) {
    checkbox1.click()
    println("Checkbox has been clicked")
  }

  val radioButton: WebElement = driver.findElement(By.cssSelector("tbody > tr:nth-child(6) > td > input[type=radio]:nth-child(2)"))

  if (radioButton.isDisplayed && radioButton.isEnabled && !radioButton.isSelected) {
    radioButton.click()
    println("Radio Button has been clicked")
  }

  val selectDropdown: Select = new Select(driver.findElement(By.cssSelector("tbody > tr:nth-child(8) > td > select")))

  selectDropdown.selectByVisibleText("Drop Down Item 2")

  val submitButton: WebElement = driver.findElement(By.cssSelector("tbody > tr:nth-child(9) > td > input:nth-child(2)"))
  submitButton.click()


  val homeLink: WebElement = driver.findElement(By.cssSelector("#back_to_form"))

  homeLink.click()



  driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php")

  driver.findElement(By.cssSelector("body > main > div > div > div.col-md-8.col-lg-8.col-xl-8 > div:nth-child(2) > button")).click()

  val simpleAlert: Alert = driver.switchTo().alert()
  println(s"The simple alert text is ${simpleAlert.getText}")
  simpleAlert.accept()

  driver.findElement(By.cssSelector("body > main > div > div > div.col-md-8.col-lg-8.col-xl-8 > div:nth-child(4) > button")).click()

  val simpleConfirm: Alert = driver.switchTo().alert()
  println(s"The confirmation alert text is ${simpleConfirm.getText}")
  simpleConfirm.dismiss()

  driver.findElement(By.cssSelector("body > main > div > div > div.col-md-8.col-lg-8.col-xl-8 > div:nth-child(5) > button")).click()

  val simplePrompt: Alert = driver.switchTo().alert()
  println(s"The prompt alert text is ${simplePrompt.getText}")
  simplePrompt.sendKeys("testing")
  simplePrompt.accept()

  driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe")
driver.switchTo().frame("iframeResult")
  println(s"This is the frame title: ${driver.findElement(By.cssSelector("body > h2")).getText}")



  driver.switchTo().frame(driver.findElement(By.cssSelector("body > iframe")))
  println(s"This is the nested frame title: ${driver.findElement(By.cssSelector("body > h1")).getText}")






  // driver.close()

  driver.quit()

}


