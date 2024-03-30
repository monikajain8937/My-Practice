package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
		List<WebElement> optionList = driver
				.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));
		System.out.println(optionList.size());
		for(WebElement e:optionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("copy")) {
				e.click();
				break;
			}
		}
	}

}
