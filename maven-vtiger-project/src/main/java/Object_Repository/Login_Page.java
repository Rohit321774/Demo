package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;
	
	
		
      ///Initialize
		
		 public Login_Page(WebDriver driver) {
			 this.driver=driver;
			 PageFactory.initElements(driver,this);
		 }
	//Declaration
			 
		@FindBy(name="user_name") 
		private WebElement User2;
		
	
		
		 
		@FindBy(name="user_password")
		private WebElement pass;
		
		@FindBy(id="submitButton")
		private WebElement logbtn;

		public WebElement getUser2() {
			return User2;
		}
		public void setUser2(WebElement user2) {
			User2 = user2;
		}
		public WebElement getPass() {
			return pass;
		}
		public void setPass(WebElement pass) {
			this.pass = pass;
		}
		public WebElement getLogbtn() {
			return logbtn;
		}
		public void setLogbtn(WebElement logbtn) {
			this.logbtn = logbtn;
		}
		public void LoginPage()
		{
			User2.sendKeys("admin");
			pass.sendKeys("admin");
			logbtn.click();
		}
	
//		@FindAll({@FindBy(name="user_name"),@FindBy(css="input[type='text']")})
		 }
	

