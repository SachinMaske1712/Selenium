package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
static {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	driver.findElement(By.id("nav-search-submit-button")).click();
	String GetText = driver.findElement(By.xpath("(//span[.='Apple iPhone 14 (128 GB) - Blue'])[3]")).getText();
	System.out.println(GetText);
	Thread.sleep(5000);
	driver.close();
	
	
}
}
