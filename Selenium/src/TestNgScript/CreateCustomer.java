package TestNgScript;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	
@Test(invocationCount = 5,priority =4)

public void createdcustmor() {
	Assert.fail();
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
