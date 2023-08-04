package TestNgScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleCompareSoftAssert {
	static {
		System.setProperty("webdriver.chrome.driver.","./driver/chromedriver");
	}
	@Test
	public void TitleCompare() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String ExpectedTitle = "Soogle";
		String ActualTitle = driver.getTitle();
SoftAssert s=new SoftAssert();
s.assertEquals(ActualTitle,ExpectedTitle);

driver.close();
s.assertAll();
}
}