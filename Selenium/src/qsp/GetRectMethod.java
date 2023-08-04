package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	int Height = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getHeight();
	int Width = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getWidth();
	int Xaxis = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getX();
	int Yaxis = driver.findElement(By.xpath("(//img[@class='high-res-image'])[2]")).getRect().getY();
	System.out.println(Height);
	System.out.println(Width);
	System.out.println(Xaxis);
	System.out.println(Yaxis);
	Thread.sleep(5000);
	driver.close();
}
}
