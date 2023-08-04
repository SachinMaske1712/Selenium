package TestNgScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mumbai extends BaseClass {
	@Test
	public void MayaNagari() {
		Reporter.log("Mumbai is Dream City",true);
	}
	
	@Test
	public void Dhoni() {
		Reporter.log("Captain Cool",true);
	}
}
