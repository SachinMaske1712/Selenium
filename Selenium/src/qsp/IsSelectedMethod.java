package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("keepLoggedInCheckBox")).click();
	boolean CheckBox = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	if (CheckBox==true) {
		System.out.println("checkbox is Selected");
	} else {
		System.out.println("checkbox is Not Selected");
	}
	Thread.sleep(5000);
	driver.close();
}
}
