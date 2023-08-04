package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatoo {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver c = new ChromeDriver();
	c.get("https://www.zomato.com/");
	c.manage().window().maximize();
	c.findElement(By.linkText("Sign up")).click();
	Thread.sleep(5000);
	c.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("sachin bhagwan maske");
	c.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("sachin.maske8666@gmail.com");
	Thread.sleep(5000);
	c.close();
}
}

