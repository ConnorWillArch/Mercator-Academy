package Automation.Week5Day2


import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object Task3 extends App {

  import org.openqa.selenium.chrome.ChromeDriver
  import org.openqa.selenium.{By, WebDriver, WebElement}


  val driver: WebDriver = new ChromeDriver
  driver.get("https://demoqa.com/automation-practice-form")
  driver.manage().window().maximize()

  val firstName: WebElement = driver.findElement(By.id("firstName"))
  //  val submitButton: WebElement = driver.findElement(By.xpath("//*[@id='submit']"))
  val readingCheckbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"))

  if (firstName.isEnabled && firstName.isDisplayed) {
    firstName.sendKeys("Alice")
    println("Firstname field filled out")
  }

  if (readingCheckbox.isDisplayed && readingCheckbox.isEnabled && !readingCheckbox.isSelected) {
    readingCheckbox.click()
    println("Checkbox has been clicked")
  }

  //  if (submitButton.isDisplayed && submitButton.isEnabled) {
  //    submitButton.click()
  //    println("Submit button has been clicked")
  //  }


  // driver.close()

   driver.quit()
}

