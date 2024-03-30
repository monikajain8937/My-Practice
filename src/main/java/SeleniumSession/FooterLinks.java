package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		List<WebElement> list = driver.findElements(By.xpath("//footer//a"));
//		System.out.println(list.size());
//		for (WebElement e : list) {
//			String text = e.getText();
//			System.out.println(text);
//	}
		By footers = By.xpath("//footer//a");
		ArrayList<String> actFooterlinks = getFooterLinks(footers);
		if (actFooterlinks.contains("Contact Us")) {
			System.out.println("Pass");
		}
	}

	public static ArrayList<String> getFooterLinks(By locator) {
		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());
		ArrayList<String> eletextList = new ArrayList<String>();
		for (WebElement e : list) {
			String text = e.getText();
			eletextList.add(text);
		}
		return eletextList;
	}
}
