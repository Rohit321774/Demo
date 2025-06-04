package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendInputAndSave {
	
	// Intilaiaztion
	WebDriver driver;
	public SendInputAndSave(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="firstname")
	private WebElement First;
	
	@FindBy(name="lastname")
	private WebElement Last;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement Save;
	public WebElement getFirst() {
		return First;
	}
	public WebElement getLast() {
		return Last;
	}
	public WebElement getSave() {
		return Save;
	}


 public void  SaveContact() {
	 First.sendKeys("Rahul");
	 Last.sendKeys("Singh");
	 Save.click();
	 
 }





}
