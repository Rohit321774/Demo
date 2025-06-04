package Base_Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import GenericUtility.FilesUtility;
import GenericUtility.WebDriverutility;
import Object_Repository.IconButton;
import Object_Repository.Login_Page;
import Object_Repository.SignOut;

public class Base_class {
	public WebDriver driver;
	public  FilesUtility file=new  FilesUtility();
	@BeforeSuite
	public void bs() {
		System.out.println("DataBase Connextion+Report Configuration");
		
	}
	@AfterSuite
	public void As() {
		System.out.println("DataBaseConnection +report BackUp");
		
	}
	@BeforeTest
	public void Bt() {
		System.out.println("pre Condition");
	}
	@AfterTest
	public void AT() {
		System.out.println("Post Condition");
	}
	
	@BeforeClass
	public void OPeningBrowser() throws IOException {
		String Broswer=file.getFilesFromProperties("browser");


		   if(Broswer.equals("chrome"))
		    {
		       driver=new ChromeDriver();
		    }
		    else if(Broswer.equals("edge"))
		    {
		       driver=new EdgeDriver();
		    } 
		    else if(Broswer.equals("firefox"))
		    {
			       driver=new FirefoxDriver();
			    }
		    else
		    {
		    	driver=new ChromeDriver();
		    }
		   WebDriverutility Web=new WebDriverutility(driver);
		   Web.maximizeWindow();
		Web.WaitforPagetoLoad();
	}
	@AfterClass
	public void Ac() {

              driver.quit();
		
	}
	@BeforeMethod
	public void Login() throws IOException 
	{
		String Url=file.getFilesFromProperties("url");
		       driver.get(Url);
		
		Login_Page log=new Login_Page(driver);
		log.LoginPage();
		
	}
	
	@AfterMethod
	public void LOgOUT() {
		IconButton Hb=new IconButton(driver);
		  Hb.Iconn();


		  SignOut sg=new SignOut(driver);
		  sg.Signout();

		
	}


	
	

}
