package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut {
	
	//Intialization
	WebDriver driver;
	public SignOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 @FindBy(linkText="Sign Out")
 private WebElement Sign;
public WebElement getSign() {
	return Sign;
}

public void Signout()
{
	Sign.click();
}
 
 
}
