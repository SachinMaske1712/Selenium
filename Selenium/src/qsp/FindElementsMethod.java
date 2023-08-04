package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
	int Count = AllLinks.size();
	System.out.println(Count);
	for (int i = 0; i < Count; i++) {
		String Links = AllLinks.get(i).getText();
		System.out.println(Links);
	}
	
	
	Thread.sleep(5000);
	driver.close();
}
}
