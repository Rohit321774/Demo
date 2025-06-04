package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverutility {
	WebDriver driver;
	Actions act;
	WebDriverWait wait;
	
	public WebDriverutility(WebDriver driver){
		this.driver=driver;
		this.act=new Actions(driver);
	 this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
	// Hover
	
	public void hover(WebElement element)
	{
		act.moveToElement(element).build().perform();;
	}
	// rightClick
	
	public void rightClick(WebElement element)
	{
		act.contextClick(element).build().perform();
	}
	//doubleClick
	
	public void doubleClick(WebElement element)
	{
		act.doubleClick(element).build().perform();
	}
	
//	clickandHold
	
	public void clickandHold(WebElement element)
	{
		act.moveToElement(element).build().perform();
	}
	//dragandDrop
	
	public void dragandDrop(WebElement element)
	{
		act.dragAndDrop(element, element).build().perform();
	}
	//movetoElement
	
	public void movetoElement(WebElement element)
	{
		act.moveToElement(element).build().perform();
	}
//	click
	
	public void click(WebElement element)
	{
		act.moveToElement(element).build().perform();
	}
	// Syntax
	
	public void sendkeys(WebElement element)
	{
		act.sendKeys(element).build().perform();
	}
	//release
	
	public void release(WebElement element)
	{
		act.release(element).build().perform();
	}
	//KeyUp
	
	public void keyUp(WebElement element)
	{
		act.keyUp((CharSequence) element).build().perform();
	}
	
	// keyDown
	
	public void keyDown(CharSequence element)
	{
		act.keyDown(element).build().perform();
	}
//	ScrolltoElement
	
	public void ScrolltoElement(WebElement element)
	{
		act.sendKeys(element).build().perform();
	}
	//  maximize
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	// minimize
	
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}
//	fullScreen
	
	public void fullScreen() {
		driver.manage().window().fullscreen();
	}
	//selectByValue
	
	public void Select(WebElement element,String value) {
	Select sel=new Select(element);
	sel.selectByValue(value);
	}
	//selectByVisibleText
	
	public void Select(String visisbleText,WebElement element) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visisbleText);
		}
	
	// selectByindex
	
	public void Select(WebElement element,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
		//Basic Wait Comamand
         public void WaitforPagetoLoad()
         {
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         }
  // Expicit wait
         
         public void WaitTillElementVisible(WebElement element,int timeOutSeconds)
         {
 		new WebDriverWait (driver,Duration.ofSeconds(timeOutSeconds)).until(ExpectedConditions.visibilityOf(element));

         }
         
         public void WaitTillElementInVisible(WebElement element,int timeOutSeconds)
         {
 		new WebDriverWait (driver,Duration.ofSeconds(timeOutSeconds)).until(ExpectedConditions.invisibilityOf(element));

         }
         
         public void WaitTilltextInElement(WebElement element,String text ,int timeOutSeconds)
         {
 		new WebDriverWait (driver,Duration.ofSeconds(timeOutSeconds)).until(ExpectedConditions.textToBePresentInElement(element,text));

         }
       // Fluent Wait  
         public void fluentWaitforElement(final By locator,int timeOutSeconds)
         {
              Wait<WebDriver> fluentWait=new FluentWait<>(driver).withTimeout(Duration.ofSeconds(timeOutSeconds)).
            		  pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

         }
         public void waitforUrlContains(String titlePart,int timeOutSeconds)
         {
    new WebDriverWait(driver,Duration.ofSeconds(timeOutSeconds)).until(ExpectedConditions.titleContains(titlePart));

         }
         public void moveOverSlider(WebElement slider,int xoffset)
         {
        	 act.clickAndHold().moveByOffset(xoffset, 0).release().build().perform();
        	 
         }
		
         public void scrollByOffSet(int x,int y) {
        	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)");
         }
         
         
         public void scrollintoView(int x,int y) {
        	 ((JavascriptExecutor) driver).executeScript("window.scrollBy("+x+","+y+")");
         }
         
         // IMPORTANT COMMANDS
              public void clearAndSendKeys(WebElement element,String text)  
              {
                 element.clear();
                  element.sendKeys(text);
              }
              public void sendKeyboardKey(WebElement element,Keys Key)  
              {
              
                  element.sendKeys(Key);
              }

             public void navigateBack()
             {
            	 driver.navigate().back();
             }
             public void navigateForward()
             {
            	 driver.navigate().forward();
             }
             public void Refreshpage()
             {
            	 driver.navigate().refresh();
             }
              public void uncheackedBox(WebElement checkbox)
              {
            	 if(checkbox.isSelected())
            	 {
            		 checkbox.click();
            	 }
              }
         public boolean isCheckboxChecked(WebElement checkbox)
         {
        	 return checkbox.isSelected();
         }
         public void selectRadiobutton(WebElement radioButton)
         {
        	 if(radioButton.isSelected())
        	 {
        		  radioButton.click();
        	 }
         }
         public boolean isSelectRadiobutto(WebElement radioButton)
         {
        	  return radioButton.isSelected();
         }
         public void pressEnter(WebElement element)
         {
        	 element.sendKeys(Keys.ENTER);
         }
         public void pressEscape(WebElement element)
         {
        	 element.sendKeys(Keys.ESCAPE);
         }
         public void pressTab(WebElement element)
         {
        	 element.sendKeys(Keys.TAB);
         }
         public void pressCtrlA(WebElement element)
         {
        	 element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
         }
         public void pressCtrlC(WebElement element)
         {
        	 element.sendKeys(Keys.chord(Keys.CONTROL,"c"));
         }
         public void pressCtrlV(WebElement element)
         {
        	 element.sendKeys(Keys.chord(Keys.CONTROL,"v"));
         }
             public void dismissAlert() {
            	 driver.switchTo().alert().dismiss();;
             }
             public String getAlertText() {
            	return driver.switchTo().alert().getText();
				
             }
             public void sendAlertText(String text) {
             driver.switchTo().alert().sendKeys(text);
 			}
             
             public void takeScreenShotWebPage(String screenShotName) throws IOException
             {
            	 TakesScreenshot tks=( TakesScreenshot)driver;
            	 File Source=tks.getScreenshotAs(OutputType.FILE);
            	 File desti=new File("");
            	 Files.copy(Source, desti);
             }
             public void takeScreenShotElement(String screenShotName) throws IOException
             {
            	 WebElement scrnn=driver.findElement(By.id(""));
            	 File Source=scrnn.getScreenshotAs(OutputType.FILE);
            	 File desti=new File("");
            	 Files.copy(Source, desti);
             }
    //         public void SwitchToWindowTitle(String partialWindowTiltel)
}

	
