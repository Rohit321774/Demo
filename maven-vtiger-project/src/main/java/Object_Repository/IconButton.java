package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IconButton {

	WebDriver driver;
	public IconButton(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css="img[src='themes/softed/images/user.PNG']")
	private WebElement Icon;
	public WebElement getIcon() {
		return Icon;
	}

       public void Iconn()
       {
    	   Icon.click();
       }
	
}
