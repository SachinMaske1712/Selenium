package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("ajab prem ki gajab kahani");
		driver.findElement(By.id("search-icon-legacy")).click();
	//	driver.findElement(By.xpath("")).click();
		//Thread.sleep(5000);
		
		
		
	}
}
