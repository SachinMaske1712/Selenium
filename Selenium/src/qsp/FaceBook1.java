package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook1 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("sachin");
		driver.findElement(By.name("lastname")).sendKeys("maske");
		driver.findElement(By.name("reg_email__")).sendKeys("9763271666");
		driver.findElement(By.id("password_step_input")).sendKeys("fhfddt");
		Thread.sleep(5000);
		driver.close();
	}	

}
