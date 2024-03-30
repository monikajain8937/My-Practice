package SeleniumSession;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// browser - ch
		driver.manage().window().maximize();

		driver.get("https://www.freshworks.com/");

		By support = By.linkText("Demo");
		

	}
	public static WebElement getElemnet(By locator) {
		return driver.findElement(locator);
	}
	public static void retryingElement(By locator, int timeout) {
		WebElement element = null;
		int attempts= 0;
		while(attempts <timeout) {
			try {
				element=getElemnet(locator);
				System.out.println("element is found in attempt:"+attempts);
				break;
			}
			catch(NoSuchElementException e){
				System.out.println("element is not found:" +attempts+ ":" + "for" +locator);
				
			}
			try {
				Thread.sleep(500);
			}catch(InterruptedException e1) {
				e1.printStackTrace();
			}
			if (element == null) {
				try {
					throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
				} catch (Exception e) {
					System.out.println("element is not found exception ...tried for : " + timeout + " secs"
							+ " with the interval of : " + 500 + " ms");

				}

			
		}
			return;
	}

}}
