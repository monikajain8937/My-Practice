package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayedMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
//	boolean searchField= driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//System.out.println(searchField);
		By searchField = By.id("twotabsearchtextbox");
		if (doEleIsDisplayed(searchField)) {
			System.out.println("ele is displayed");
			doSendKeys(searchField, "Macbook Pro");
		} else {
			System.out.println("ele is not dispalyed");
		}
	}

	public static boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}
