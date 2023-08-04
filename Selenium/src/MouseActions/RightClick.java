package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	WebElement s = driver.findElement(By.linkText("actiTIME Inc."));
	Actions a=new Actions(driver);
	a.contextClick(s).perform();
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	Thread.sleep(5000);
	driver.quit();
	
			

}
}
