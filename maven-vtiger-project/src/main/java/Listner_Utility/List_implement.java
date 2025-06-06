package Listner_Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class List_implement implements ITestListener,ISuiteListener {
    ExtentReports report;
    ExtentTest test;
    @Override
	public void onStart(ISuite Suite) {
		System.out.println("Db Connection + Report Configuration");
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\rohit\\git\\rohit\\maven-vtiger-project\\src\\main\\resources\\EXtra1\\dummy.html");
		          spark.config().setDocumentTitle("Dummy Report");
		          spark.config().setReportName("REPORTING");
		          spark.config().setTheme(Theme.DARK);
		          
		       report=new   ExtentReports();
		          
		            report.attachReporter(spark);
		               report.setSystemInfo("browser","chrome");
		               report.setSystemInfo("window","11");
		               report.setSystemInfo("version","102.25");
	}
    public void onFinish(ISuite Suite) {
   	 System.out.println("Db+ Report BackUp");
   	  report.flush();
   	  }
   	
	@Override
	public void onTestStart(ITestResult result) {
           String methodName=result.getMethod().getDescription();
           test=report.createTest(methodName);

	}
	@Override
	public void onTestSuccess(ITestResult result) {
             System.out.println("OH TEST PASSEd......");
            test.log(Status.PASS, "PAssed");

	}
	@Override
	public void onTestFailure(ITestResult result) {
		  System.out.println("OH TEST PASSEd......");
          test.log(Status.FAIL, "Fail Fail");
          
          TakesScreenshot tks=(TakesScreenshot) Listner.sdriver;
          String ss=tks.getScreenshotAs(OutputType.BASE64);
          test.addScreenCaptureFromBase64String(ss,"ScreenShot1");
          System.out.println("Taken ScreenShot");

	}
	@Override
	public void onTestSkipped(ITestResult result) {
		  System.out.println("OH TEST Skkiped.....");
          test.log(Status.SKIP, "test got skipped");

	}
	
}
