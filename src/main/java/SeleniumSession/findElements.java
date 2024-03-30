package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		System.out.println("TotalLinks :" + totalLink.size());

		for (int i = 0; i < totalLink.size(); i++) {
			String Text = totalLink.get(i).getText();
			if (Text.length() != 0) {
				System.out.println(Text);
			}

		}
	}

}
