package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tinder.com/");
	String value = driver.findElement(By.xpath("//h1[.='Start something epic.']")).getCssValue("Color");
	System.out.println(value);
	Thread.sleep(3000);
	driver.close();
}
}
