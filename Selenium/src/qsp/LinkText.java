package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SACHIN/Documents/HTML%20Files/webpage.html");
		driver.findElement(By.linkText("Myntra")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
