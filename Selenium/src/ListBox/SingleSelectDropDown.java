package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
static {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	
	WebElement day=driver.findElement(By.id("day"));
	Select s=new Select(day);
	s.selectByIndex(7);
	WebElement month = driver.findElement(By.id("month"));
	Select s1=new Select(month);
	s1.selectByValue("6");
	WebElement year = driver.findElement(By.id("year"));
	Select s2=new Select(year);
	s2.selectByVisibleText("2022");
	
	Thread.sleep(5000);
	driver.close();
	
	
	
	
}
}
