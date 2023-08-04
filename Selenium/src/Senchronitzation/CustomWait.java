package Senchronitzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		
		int i=0;
		while (i<500) {
		try {
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			driver.findElement(By.id("logoutLink")).click();
		break;
		} 
		catch (Exception e) {
			i++;
		}
		}
		driver.close();
	}
}
	
