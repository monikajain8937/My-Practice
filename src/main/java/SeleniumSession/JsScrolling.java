package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsScrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.getwellstaywell.ca/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		WebElement books= driver.findElement(By.xpath("//h3[text()= 'START SAVING']"));
		js.executeScript("arguments[0].scrollIntoView(true);", books);
	}

}
