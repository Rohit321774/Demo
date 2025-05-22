package CrmProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import  java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactModule {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		
// Java Object Represtation Of Physical Files(Taking File)
		
	FileInputStream fls=new FileInputStream("D:\\maven-vtiger-project\\src\\main\\resources\\CommonData.properties");
	
//Loading The File(fls)
	
		Properties pro=new Properties();
		 pro.load(fls);
		 
// Get used Of properties method
		 String url=pro.getProperty("url");
		   String  User=pro.getProperty("Username");
		   String browser=pro.getProperty("browser");
		   String Password=pro.getProperty("Password");
		   
		   System.out.println("URL ="+" "+url);
		   
		   System.out.println("USERname"+" "+User);
		   System.out.println("PASSWORD"+" "+Password);
		
//Get Data from Excel Files
		   FileInputStream fls2=new FileInputStream("C:\\Users\\rohit\\OneDrive\\Desktop\\Book1.xlsx");
		   Workbook wb=WorkbookFactory.create(fls2);
		   String Contact=wb.getSheet("sheet1").getRow(3).getCell(0).getStringCellValue()+(int)(Math.random()*1000);             System.out.println(Contact);
		   String Name=wb.getSheet("sheet1").getRow(5).getCell(0).getStringCellValue()+(int)(Math.random()*1000);
		  ;System.out.println(Name);


// Cross Broswer Testing
		   
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

		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//Login to VtigerPage			
			
			driver.get(url);
			 
		WebElement Username=driver.findElement(By.name("user_name"));
		 Username.sendKeys(User);
		 
		WebElement password=driver.findElement(By.name("user_password"));
		 password.sendKeys(Password);
		   
				       driver.findElement(By.cssSelector("input[type='submit']")).click();
// Creating Contact	
				       
	 driver.findElement(By.linkText("Contacts")).click();
	 driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	 
	 WebElement First= driver.findElement(By.name("firstname"));
	 First.sendKeys("Roheet");
	 
	 WebElement Last= driver.findElement(By.name("lastname"));
	 Last.sendKeys("Singh");
	 String las=Last.getText();
	 
// Save Contact	 
	 
	 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	 
//Verification	
	 
	 WebElement save=driver.findElement(By.id("mouseArea_Last Name"));
	 String get=save.getText();
	 if(get.contains(las))
	 {
		 System.out.println("Contact CReated SuccesFully::");
	 }
	 else
	 {
		 System.out.println("NOT CREATED");
	 }
	 
// LogOut
	 
 driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']")).click();
 driver.findElement(By.linkText("Sign Out")).click();
 
 driver.quit();
	 
}
}