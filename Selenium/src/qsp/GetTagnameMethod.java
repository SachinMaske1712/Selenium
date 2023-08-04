package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	String TagName = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getTagName();
	System.out.println(TagName);
	Thread.sleep(5000);
	driver.close();
}
}
