package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
//		Alert alert= driver.switchTo().alert();
//		alert.accept();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239']//*[local-name()='svg'])[2]")).click();
         WebElement from =driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"));
         from.click();
         from.sendKeys("Agr");
         driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("Delhi");
         driver.findElement(By.xpath("(//div[@class='css-1dbjc4n']//*[local-name()='svg'])[9]")).click();
         
	}

}
