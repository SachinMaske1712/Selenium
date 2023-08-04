package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/SACHIN/OneDrive/Desktop/webpage.html");
	driver.findElement(By.id("vishu")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	driver.findElement(By.id("vishuu")).click();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	
}

}
