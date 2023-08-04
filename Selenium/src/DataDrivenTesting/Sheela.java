package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Sheela {
public String ReadDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/CommanData.property");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	
	
	
	
	
}
	

	
}

