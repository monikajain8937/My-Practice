package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		WebElement country= driver.findElement(By.id("Form_getForm_Country"));
		
		Select sel= new Select(country);
		List<WebElement> CountryOption= sel.getOptions();
		System.out.println("total nb of options:"+ (CountryOption.size()-1));
		for(WebElement e: CountryOption) {
			String Text= e.getText();
			System.out.println(Text);
		}
		//sel.selectByIndex(5);
		//sel.selectByVisibleText("Afghanistan");
		//sel.selectByValue("American Samoa");
		//By country= By.id("Form_getForm_Country");
		//doSelectDropdownbyIndex(country, 20);
		//doSelectDropdownbyValue(country,"India");

	}
	public static void doSelectDropdownbyIndex(By locator, int Index) {
		Select select= new Select(getElement(locator));
		select.selectByIndex(Index);
	}
	public static void doSelectDropdownbyValue(By locator, String value) {
		Select select= new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropdownbyVisibletext(By locator, String text) {
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	public static List<WebElement> getDropdownOption(By locator) {
		Select select= new Select(getElement(locator));
		return select.getOptions();
	
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
