package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts {
	WebDriver driver;
	 //Intialization
	 
	public Contacts(WebDriver driver) {
		this.driver=driver;
		 PageFactory.initElements(driver,this );
	}
	
	@FindBy(linkText="Contacts")
	private WebElement Contact;
	
	
	public WebElement getContact() {
		return Contact;
	}
       public void Contacts() {
    	    Contact.click();
		
	}

	
	
	// Declaration
	
}