package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	boolean Button = driver.findElement(By.name("login")).isEnabled();
	if (Button==true) {
		System.out.println("Button is Enabled");
	} else {
		System.out.println("Button is Not Enabled");
	}
	Thread.sleep(5000);
	driver.close();
}
}
