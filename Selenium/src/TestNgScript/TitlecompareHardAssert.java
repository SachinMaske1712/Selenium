package TestNgScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitlecompareHardAssert {
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
Assert.assertEquals(ActualTitle, ExpectedTitle);

driver.close();
}
}