package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("pushpavati song");
		Thread.sleep(5000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[.='Kranti | Pushpavati Kannada Song | Darshan |V Harikrishna|Shylaja Nag, B Suresha| Media House Studio']")).click();
		
		
	}

}
