package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends Basetest{
	
	@Test(priority = 1)
	public void searchTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test(priority = 2)
	public void pageTitleTest() {
		String Title= driver.getTitle();
		Assert.assertEquals(Title, "Your Store");
	}

	
}
