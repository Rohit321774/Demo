package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ID {
	WebDriver driver;
	public ID(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
 public WebElement getSerchIn() {
		return SerchIn;
	}

@FindBy(id="bas_searchfield")
 private WebElement SerchIn;
public void getSerch() {
	Select sel=new Select(SerchIn);
    sel.selectByValue("lastname");
}

}
