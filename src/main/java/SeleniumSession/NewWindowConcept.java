package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentWindowID=driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().window(parentWindowID);
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());

	}

}
