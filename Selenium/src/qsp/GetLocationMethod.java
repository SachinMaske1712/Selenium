package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		int X = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getX();
		int Y = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getLocation().getY();
	System.out.println(X);	
	System.out.println(Y);
	driver.close();
}
	
}