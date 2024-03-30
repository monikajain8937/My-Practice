package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		//type='file' should be there.
		driver.findElement(By.name("upfile"))
		.sendKeys("C://Users//monjain5//Downloads//Jar QA Assignment.pdf/");
		

	}

}
