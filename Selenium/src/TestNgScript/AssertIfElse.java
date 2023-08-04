package TestNgScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertIfElse {
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
	if (ExpectedTitle.equals(ActualTitle)) {
		Reporter.log("Title is Matching",true);
		
	} else {
		Reporter.log("Title is Not Matching",true);

	}
	driver.close();
}
}
