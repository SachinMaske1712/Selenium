package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
static {
	System.setProperty("webdriver.chromedriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/SACHIN/Documents/HTML%20Files/WEBTEC.html");
	Thread.sleep(5000);
	driver.findElement(By.id("vishuu")).click();
	Thread.sleep(5000);
	driver.close();
}
}


