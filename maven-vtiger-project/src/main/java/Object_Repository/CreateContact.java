package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContact {
	WebDriver driver;
	
//Intilaization
	 public CreateContact(WebDriver driver)
	 {this.driver=driver;
	  PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(css="img[title='Create Contact...']")
	 private WebElement CreateContact;

	public WebElement getCreateContact() {
		return CreateContact;
	}

       public void createContact() {
    	   CreateContact.click();
       }
}
