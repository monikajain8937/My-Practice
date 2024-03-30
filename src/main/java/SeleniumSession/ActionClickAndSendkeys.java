package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickAndSendkeys {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By F_N = By.id("input-firstname");
		By checkBox = By.name("agree");
		Actions ac = new Actions(driver);
		ac.sendKeys(driver.findElement(F_N), "Monika").build().perform();
		ac.click(driver.findElement(checkBox)).build().perform();

	}
	public static void doActionClick(By locator) {
		Actions ac= new Actions(driver);
		ac.click(getElement(locator)).build().perform();
	}
	public static void dosendkeys(By locator, String value) {
		Actions ac= new Actions(driver);
		ac.sendKeys(getElement(locator), value).build().perform();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
}
