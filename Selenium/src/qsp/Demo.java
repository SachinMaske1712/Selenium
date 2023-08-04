package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
}
}
