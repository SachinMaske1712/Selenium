package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver s=new ChromeDriver();
		s.get("https://www.instagram.com/");
		s.getTitle();
		String mi=s.getTitle();
		System.out.println(mi);
		Thread.sleep(5000);
		s.close();
		
	}

}
