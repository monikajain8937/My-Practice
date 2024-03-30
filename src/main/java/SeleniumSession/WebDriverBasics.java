package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebDriverBasics extends BrowserUtil {

	public static void main(String[] args) throws Exception {
		
			launchBrowser("Chrome");
			launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			//driver.findElement(By.id("input-email")).sendKeys("xyz@gmail.com");
			//driver.findElement(By.id("input-password")).sendKeys("Monika@123");
			//driver.findElement(By.className("")).click();
			By email= By.id("input-email");
			By password= By.id("input-password");
			doSendKeys(email, "mjn@gmail.com");
			doSendKeys(password, "Monika@123");
			By loginbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
			doClick(loginbtn);
			By wrnMsg = By.className("alert-danger");
			String wrnMsgValue= doGetText(wrnMsg);
		System.out.println(wrnMsgValue);
		String attrValue= driver.findElement(By.className("img-responsive")).getAttribute("src");
		System.out.println(attrValue);
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	


}
