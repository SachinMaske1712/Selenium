package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSaggestionAmazon {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	Thread.sleep(3000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung phone");
List<WebElement> Suggest = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
int count = Suggest.size();
System.out.println(count);
for (int i = 0; i < count; i++) {
	String name = Suggest.get(i).getText();
	System.out.println(name);
	Thread.sleep(2000);
}
Thread.sleep(5000);
driver.close();
}

}
