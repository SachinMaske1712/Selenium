package TestNgScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Actress {
	@Test(invocationCount = 5,priority =4)

	public void createdcustmor() {
		Reporter.log("creted customer",true);
	}
	@Test(priority =2)
	public void deletecustmor() {
		Reporter.log("custmor delete",true);
		
	}
	@Test(priority =1)
	public void editcustmor() {
		Reporter.log("custmor edit",true);
		
	}
	@Test(priority =3)
	public void modifycustmor() {
		Reporter.log("custmor modify",true);
	}
	}


