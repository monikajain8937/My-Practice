package SeleniumSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.getwellstaywell.ca/");
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='haleon-logo']/img")).click();
		Thread.sleep(4000);
		Set<String> handles= driver.getWindowHandles();
		List<String> handleList= new ArrayList<String>(handles);
		String parentWindowId= handleList.get(0);
		System.out.println(parentWindowId);
		String chileWindowId= handleList.get(1);
		System.out.println(chileWindowId);
		//Switching
		driver.switchTo().window(chileWindowId);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		

	}

}
