package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) throws Exception {
		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			if (browserName.equalsIgnoreCase("Safari")) {
				driver = new SafariDriver();

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("It is not a valid browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void launchUrl(String url) throws Exception {
		try {
			driver.get(url);
			// driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Url is not correct");

		}
	}

	public static void pageTitle() throws Exception {
		try {
			System.out.println(driver.getTitle());

		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("It is not a valid browser");
		}
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void driverQuit() {
		driver.quit();
	}

	public static void driverClose() {
		driver.close();
	}

}
