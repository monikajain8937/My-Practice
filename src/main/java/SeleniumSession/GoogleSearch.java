package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		By searchKey= By.name("q");
		By suggestions= By.xpath("//div[@class='wM6W7d']/span");
		googleSearch(searchKey, "Selenium", suggestions, "selenium tutorial");
	}
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(3000);
//		List<WebElement> sugList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		System.out.println(sugList.size() - 3);
//		for (WebElement e : sugList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("selenium tutorial")) {
//				e.click();
//				break;
//			}
//		}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void googleSearch(By searchlocator, String searchKey, By Suggestionlocator, String value) throws InterruptedException {
		getElement(searchlocator).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> sugList = getElements(Suggestionlocator);
		System.out.println(sugList.size() - 3);
		for (WebElement e : sugList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}

		}
	}
}
