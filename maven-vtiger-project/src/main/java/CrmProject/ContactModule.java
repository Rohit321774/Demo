package CrmProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base_Utility.Base_class;
import GenericUtility.FilesUtility;
import Object_Repository.Contacts;
import Object_Repository.CreateContact;
import Object_Repository.SendInputAndSave;

public class ContactModule extends Base_class{
public	WebDriver driver;
 // @Parameters("browser")	
// @Test(groups="smoke")	
	@Test
	public  void createContactmodule() throws IOException{ 
 
		 
// Get used Of properties method
		
		 FilesUtility file=new  FilesUtility();
		 
		         String url=file.getFilesFromProperties("url");
		         String User=file.getFilesFromProperties("Username");
		   String browser=file.getFilesFromProperties("browser");
		   String Password=file.getFilesFromProperties("Password");
		   
		   System.out.println("URL ="+" "+url); 
		   System.out.println("USERname"+" "+User);
		   System.out.println("PASSWORD"+" "+Password);
		
//Get Data from Excel Files
		   
		 String Contact=file.getFilesFromExcel("contact", 5, 1);
System.out.println(Contact);
String Contact1=file.getFilesFromExcel("contact", 4, 0);
System.out.println(Contact1);

// Cross Broswer Testing
		   
		 
//Click On Contact	
	Contacts cn=new Contacts(driver);
	 cn.Contacts();
	 
// click on CreateContact and Save It
	 
	 CreateContact cc=new CreateContact(driver);
      cc.createContact();

    SendInputAndSave S=new SendInputAndSave(driver);
     S.SaveContact();
  
//Verfication
        
         WebElement save=driver.findElement(By.id("mouseArea_Last Name"));
    	 String get=save.getText();
    	 if(get.equals(S.getLast()))
    	 {
    		 System.out.println("NOt CReated::");
    	 }
    	 else
    	 {
    		 System.out.println("Created succesFully::");
    	 }
// Log Out
	  driver.quit();
}
}
