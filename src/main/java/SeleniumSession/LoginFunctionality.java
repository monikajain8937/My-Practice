package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//5sec---5sec---
		driver.findElement(By.id("email")).sendKeys("voltarengel97@gmail.com");
		//0
		driver.findElement(By.id("pass")).sendKeys("Indigo@123");
		driver.findElement(By.name("login")).click();
		

	}

}
