package SeleniumSession;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSizeConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().window().setPosition(new Point(500, 400));
		driver.get("https://www.google.com/");
		

	}

}
