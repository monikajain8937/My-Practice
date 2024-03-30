package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PesudoElementHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		// window.getComputedStyle(document.querySelector("label[for=input-firstname]"),'::before').getPropertyValue('content')
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ManField = js.executeScript(
				"window.getComputedStyle(document.querySelector(\"label[for=input-firstname]\"),'::before').getPropertyValue('content')")
				.toString();
		System.out.println(ManField);

	}

}
