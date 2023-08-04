package TestNgScript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
@Test
public void CreateCustomer() {
	Reporter.log("Customer Created successfully",true);
}
@AfterSuite
public void DatabaseDisconnection() {
	Reporter.log("Database Disconnected",true);
}
@BeforeTest
public void LaunchBrowser() {
	Reporter.log("Browser is Launched",true);
}
@AfterMethod
public void Logout() {
	Reporter.log("Logout Successfully",true);
}
@BeforeMethod
public void Login() {
	Reporter.log("Logged in Successfully",true);
}
@AfterTest
public void CloseBrowser() {
	Reporter.log("Browser Closed Successfully",true);
}
@BeforeSuite
public void DatabaseConnection() {
	Reporter.log("database Connected",true);
}
}
