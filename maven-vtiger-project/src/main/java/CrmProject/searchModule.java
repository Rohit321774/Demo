package CrmProject;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtility.FilesUtility;
import GenericUtility.WebDriverutility;
import Object_Repository.ID;
import Object_Repository.IconButton;
import Object_Repository.Login_Page;
import Object_Repository.SearchName;
import Object_Repository.SignOut;
import Object_Repository.Submit;

public class searchModule {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
//  java Object Representation
		
		 FilesUtility file=new  FilesUtility();
		 
         String url=file.getFilesFromProperties("url");
         String User=file.getFilesFromProperties("Username");
   String browser=file.getFilesFromProperties("browser");
   String Password=file.getFilesFromProperties("Password");
   
   System.out.println("URL ="+" "+url); 
   System.out.println("USERname"+" "+User);
   System.out.println("PASSWORD"+" "+Password);

// Get Data From excel File
   String Contact=file.getFilesFromExcel("contact", 4, 0);
   System.out.println(Contact);
   String Contact1=file.getFilesFromExcel("contact", 3, 1);
   System.out.println(Contact1);
// CROSS Browser TestIng
				   
				    WebDriver driver=null;
				    if(browser.equals("chrome"))
				    {
				       driver=new ChromeDriver();
				    }
				    else if(browser.equals("edge"))
				    {
				       driver=new EdgeDriver();
				    } 
				    else if(browser.equals("firefox"))
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
	
	  
	  driver.get(url);
	  
	  Login_Page log=new Login_Page(driver);
		log.LoginPage();

		SearchName Sn=new SearchName(driver);
		
		   Sn.Search();
		   
		  ID id=new ID(driver);
		  id.getSerch();
		   


		 
		 Submit sb=new Submit(driver);
		 sb.submit();

		         IconButton Hb=new IconButton(driver);
		   	  Hb.Iconn();


		   	  SignOut sg=new SignOut(driver);
		   	  sg.Signout();
		   	  
		   	  driver.quit();


		
	}

}
