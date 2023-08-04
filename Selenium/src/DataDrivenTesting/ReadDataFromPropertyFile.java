package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/CommanData.property");
		Properties p=new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String UN = p.getProperty("username");
		String PSW = p.getProperty("password");
		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PSW);
	
		
		
		
		
	}

}
