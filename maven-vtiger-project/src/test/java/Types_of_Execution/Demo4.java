package Types_of_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
    @Test(groups="regression")
  public void Demo() {
    	WebDriver driver=new ChromeDriver();
       	Reporter.log("Fourth");
       }

}
