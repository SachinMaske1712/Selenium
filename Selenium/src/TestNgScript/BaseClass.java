package TestNgScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("Database Connected",true);
	}
	
@BeforeTest
public void launchBrowser() {
	 driver= new ChromeDriver(); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 Reporter.log("Browse is Launched",true);
		}

@BeforeMethod
public void Login() {
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Reporter.log("Logged in Successfully",true);
}

//@test
//public void CreateCustomer() {
//Reporter.log("customer Created Successfully",true);
//}

	@AfterMethod
	public void Logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout Successfully",true);
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Browser Closed Successfully",true);
	}
	
	@AfterSuite
	public void DatabaseDisconnection() {
		Reporter.log("Database Disconnected",true);
	}
}	
