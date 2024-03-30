package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent window
		Thread.sleep(5000);

		String parentWindowId = driver.getWindowHandle();

		WebElement linkedIn = driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]"));
		linkedIn.click();// linkedin
		WebElement fb = driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]"));
		fb.click();// fb
		WebElement tw = driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]"));
		tw.click();// tw
		WebElement YT = driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]"));// YT
		YT.click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			if (driver.getTitle().contains("LinkedIn")) {
				driver.findElement(By.xpath("//*[@id='organization_guest_contextual-sign-in']/div/section/button"))
						.click();
				driver.findElement(By.xpath("//*[@id='main-content']/section[1]/section/div/div[2]/div[1]/div/a[1]"))
						.click();
				Thread.sleep(2000);
			}
			if (driver.getTitle().contains("YouTube")) {
				driver.findElement(By.xpath(
						"//*[@id='subscribe-button']/ytd-button-renderer/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"))
						.click();
				Thread.sleep(2000);
			System.out.println(driver.getTitle());
			}



		}
	}

}
