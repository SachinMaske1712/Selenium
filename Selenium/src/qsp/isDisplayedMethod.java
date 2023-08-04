package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMethod {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	
boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();

if (logo==true) {
		System.out.println("logo is Displayed");
		
	} else {
		System.out.println("logo is Not Displayed");

	}
	driver.close();
}
}
