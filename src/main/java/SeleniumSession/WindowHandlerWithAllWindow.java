package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithAllWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		while (it.hasNext()) {
			String windowid = (String) it.next();
			driver.switchTo().window(windowid);
			String Title = driver.getTitle();
			System.out.println(Title);
			Thread.sleep(2000);
			if (!windowid.equals(parentWindowID)) {
				driver.close();

			}
		}
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
	
	}

}
