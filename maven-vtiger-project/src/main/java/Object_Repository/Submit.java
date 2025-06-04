package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Submit {
	WebDriver driver;
	public Submit(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
 public WebElement getSerchIn() {
		return subtnn;
	}

@FindBy(css="input[name='submit']")
 private WebElement subtnn;
public void submit() {
       subtnn.click();
}

}
