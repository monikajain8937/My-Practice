package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingToolsPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/search?q=testing+tools&rlz=1C1GCEA_enIN1077IN1077&oq=testing+&gs_lcrp=EgZjaHJvbWUqDggAEEUYJxg7GIAEGIoFMg4IABBFGCcYOxiABBiKBTIICAEQRRgnGDsyBggCEEUYOTIPCAMQABgUGIcCGLEDGIAEMg0IBBAAGIMBGLEDGIAEMgYIBRBFGD0yBggGEEUYPDIGCAcQRRg9qAIAsAIA&sourceid=chrome&ie=UTF-8");
//	driver.findElement(By.id("APjFqb")).sendKeys("testing");
//		Thread.sleep(3000);
//		List<WebElement> sugList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		for (WebElement e : sugList) {
//			String text = e.getText();
//			if (text.equals("testing tools")) {
//				e.click();
//				break;
//			}
		
		List<WebElement> tools= driver.findElements(By.xpath("//div[@class='hXfKwd']/span//*[local-name()='svg']"));
		for(WebElement e: tools) {
			e.click();
		
		Thread.sleep(3000);
		WebElement text2 = driver.findElement(By.xpath("//aside[@data-id='4ae52f7e']"));
		String content = text2.getText();
		System.out.println(content);
		}
	}
}
