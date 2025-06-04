package GenericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Working_With_Adavane_Reports {
	 ExtentReports Report;
	@BeforeSuite
	public void bs() {
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\rohit\\git\\rohit\\maven-vtiger-project\\src\\main\\resources\\EXtra1\\dummy.html");
		spark.config().setDocumentTitle("Dummy");
		spark.config().setReportName("Report 1");
		spark.config().setTheme(Theme.STANDARD);
		
		ExtentReports Report =new ExtentReports();
		 Report.attachReporter(spark);
		 
		 Report.setSystemInfo("browser","chrome");
		 Report.setSystemInfo("windows","11");
		 Report.setSystemInfo("version ","1.2.20");
	}
	@Test
 public void case1() {
           ExtentTest test=Report.createTest("Case1");
		  test.log(Status.INFO, "This is Information");
		  test.log(Status.PASS, "This is  pass Information");
		  test.log(Status.SKIP, "This is to SKIP Information");
		  test.log(Status.WARNING, "This is Warning Information");
		  test.log(Status.FAIL, "This is  Failing Information");
		  
	
	}
	@Test
	 public void case2() {
	           ExtentTest test=Report.createTest("Case2");
			  test.log(Status.INFO, "This is Information");
			  test.log(Status.PASS, "This is  pass Information");
			  }
	@Test
	 public void case3() {
	           ExtentTest test=Report.createTest("Case1");
			  test.log(Status.INFO, "This is Information");
			  test.log(Status.FAIL, "This is  Failing Information");
	}
	@AfterSuite
	 public void repBackUP() {
		Report.flush();
	}
}
