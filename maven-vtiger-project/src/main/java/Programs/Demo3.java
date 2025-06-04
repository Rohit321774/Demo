package Programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Demo3{
	@Parameters("browser")
	@Test(groups="smoke")

public void Demog() {
		Reporter.log("String");
	}
	@Test
	public void Demoggg() {
		Reporter.log("String ");
	}
}