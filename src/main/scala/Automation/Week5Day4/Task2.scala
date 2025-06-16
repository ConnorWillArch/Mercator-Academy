package Automation.Week5Day3


import org.openqa.selenium.{Alert, By, JavascriptExecutor, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait, Select, WebDriverWait}

import java.time.Duration
import scala.jdk.CollectionConverters.CollectionHasAsScala


object Task2 extends App {


  val driver: WebDriver = new ChromeDriver
  driver.get("https://cosmocode.io/automation-practice-webtable")
  driver.manage().window().maximize()
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  val js: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]

  val table: WebElement = driver.findElement(By.id("countries"))
  val rows: Seq[WebElement] = table.findElements(By.xpath("//tbody/tr[position() > 1]")).asScala.toSeq
  val countryHeader: WebElement = table.findElement(By.xpath("//tbody/tr[position() = 1]"))
  val pageTitle =   js.executeScript("return document.title;").toString

  println(s"Page title is: $pageTitle")

  js.executeScript("arguments[0].style.backgroundColor = 'green'", countryHeader)



  println("All countries in the table:")

  for (row <- rows) {


    val countryName = row.findElement(By.cssSelector("td:nth-child(2)")).getText
    js.executeScript("arguments[0].style.backgroundColor = 'yellow'", row)

    println(s". ${countryName}")


    js.executeScript("arguments[0].style.backgroundColor = ''", row)
  }

  val explicitWait = new WebDriverWait(driver, Duration.ofMinutes(1))

  val germanyRow: WebElement = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[66]")))


  val capital = germanyRow.findElement(By.cssSelector("td:nth-child(3)")).getText
  val currency = germanyRow.findElement(By.cssSelector("td:nth-child(4)")).getText

  println(s"Germany -> Capital: $capital, Currency: $currency")


  val fluentWait = new FluentWait[WebDriver](driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofMillis(500))

val indiaRow = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"countries\"]/tbody/tr[78]")))
  js.executeScript("arguments[0].style.backgroundColor = 'orange'", indiaRow)
  println("India row is present and highlighted")

  val frenchCells = driver.findElements(By.xpath("//table[@id='countries']//td[text()='French']")).asScala

  if (frenchCells.nonEmpty){

    val frenchRow = frenchCells.head.findElement(By.xpath("./parent::tr"))
    println(frenchRow.getText)

    js.executeScript("arguments[0].style.backgroundColor = 'pink'", frenchRow)

    println("French found it table and row highlighted")

  } else {println("French not found in table")}

  Thread.sleep(5000)




  // driver.close()
  js.executeScript("window.scrollTo(0, document.body.scrollHeight);")
  driver.quit()

}


