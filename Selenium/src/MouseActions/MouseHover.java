package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	WebElement Action = driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(Action).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	String Text = driver.findElement(By.xpath("//p[contains(.,'9243602352')]")).getText();
	System.out.println(Text);
	Thread.sleep(5000);
	driver.close();
	
}
}
