package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.getwellstaywell.ca/");
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='haleon-logo']/img")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"text-5fd11e88a0\"]/ul/li[8]/a")).click();
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindow= it.next();
		System.out.println("parent window title: " + driver.getTitle());
		String childWindow= it.next();
		System.out.println("chile window title: " + driver.getTitle());
		String grandChildWindow= it.next();
		System.out.println("grand Child Window title:"+grandChildWindow);
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow);
		driver.switchTo().window(grandChildWindow);
		driver.findElement(By.xpath("//*[@id=\"02082567596\"]/div/div[2]/div/div/p/a/span[2]")).click();
		
		//driver.findElement(By.xpath("//a[text()='Health professionals']")).click();

	}

}
