package Types_of_Execution;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
          @Parameters("browser")
        @Test(groups="smoke")
   public void Demo() {
        	WebDriver driver=new ChromeDriver();
        	Reporter.log("Third");
        }
}

