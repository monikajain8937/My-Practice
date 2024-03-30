package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.getwellstaywell.ca/");
	driver.findElement(By.xpath("//button[text()='Accept All']")).click();
//		Actions ac = new Actions(driver);
//		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Brands ']"))).build().perform();
//		Thread.sleep(3000);
//		System.out.println(".........");
//		driver.findElement(By.xpath("//a[text()='Centrum']")).click();
		By Menu = By.xpath("//a[text()='Brands ']");
		By subMenu = By.xpath("//a[text()='Centrum']");
		moveToElement(Menu, subMenu);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void moveToElement(By Menu, By subMenu) throws InterruptedException {
		Actions ac = new Actions(driver);
		ac.moveToElement(getElement(Menu)).perform();
	
		Thread.sleep(3000);
		getElement(subMenu).click();
		
	}

}
