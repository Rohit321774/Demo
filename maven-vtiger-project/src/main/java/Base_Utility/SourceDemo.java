package Base_Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SourceDemo {
	@Test(dataProvider="getData")
	
	public void getDetails(String Username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement User=driver.findElement(By.id("user-name"));
		  User.sendKeys(Username);
		  
		  WebElement pass=driver.findElement(By.id("password"));
		  pass.sendKeys(password);
		  
		  WebElement login=driver.findElement(By.id("login-button"));
		  login.click();
		  
		  driver.quit();
	}


@DataProvider
public Object[][] getData(){
	
	Object[][] ob=new Object[4][2];
	ob[0][0]="standard_user";
	ob[0][1]="secret_sauce";
	ob[1][0]="locked_out_user";
	ob[1][1]="secret_sauce";
	ob[2][0]="problem_user";
	ob[2][1]="secret_sauce";
	ob[3][0]="performance_glitch_user";
	ob[3][1]="secret_sauce";
	
	return ob;
	
}



}
