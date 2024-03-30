package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.getwellstaywell.ca/");
		driver.findElement(By.xpath("//button[text()= 'Accept All']")).click();
		By logo= By.className("haleon-logooo");

		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(logo)).click();
		//(tried for 10 second(s) with 2000 milliseconds interval)
		
	}

}
