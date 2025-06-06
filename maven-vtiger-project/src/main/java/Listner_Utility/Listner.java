package Listner_Utility;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listner_Utility.List_implement.class)
public class Listner {
	WebDriver driver;
	static WebDriver sdriver;
	@BeforeClass
	public void openBro() {
		driver=new ChromeDriver();
		 sdriver=driver;
	}
	@Test
	public void case1() throws InterruptedException {
		
		System.out.println("====CASE 1=====");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("create new account")).click();
		Thread.sleep(10);
		Assert.assertTrue(true);
		driver.close();
		
	}

public void case2() {
		
	System.out.println("====CASE 2=====");
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(true);
		driver.close();
		
		}
	public void case3() {
	
		System.out.println("====CASE 3=====");
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(true);
	driver.close();
	
	}
	
	}


