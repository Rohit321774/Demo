package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchName {
	WebDriver driver;
	public SearchName(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 @FindBy(css="input[name='search_text']")
  private WebElement Serch;
 
public WebElement getSerch() {
	return Serch;
}
public void Search() {
	Serch.sendKeys("Rishi");
	
}
 
// @FindBy(id="bas_searchfield")
// private WebElement SerchIn;
}
