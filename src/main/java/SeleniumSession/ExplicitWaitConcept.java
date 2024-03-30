package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email_id = By.id("input-email");
		By pwd = By.id("input-password");
		By logo = By.cssSelector("img.img-responsive");
//WebDriverWait(c)--->Extands--->FluentWait(c)--->implement -->Wait(I)-->Util
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement email_el = wait.until(ExpectedConditions.presenceOfElementLocated(email_id));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		email_el.sendKeys("monika@gmail.com");
		driver.findElement(pwd).sendKeys("Monika@123");
		boolean flag = driver.findElement(logo).isDisplayed();
		System.out.println(flag);
	}

}
