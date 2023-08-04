package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int Height = driver.findElement(By.name("pass")).getSize().getHeight();
		int Width = driver.findElement(By.name("pass")).getSize().getWidth();
		System.out.println(Height);
		System.out.println(Width);
	driver.close();
}
}