package testForPolicy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazarApp3.TermInsurance;
import policyBazarApp3.Viewproceed;

public class TestNgView {
	private WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		 
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\chromedriver.exe");

        driver =new ChromeDriver ();
        driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void LounchApp() throws InterruptedException
	{
		 driver.get("https://www.policybazaar.com/");
	        
	        Thread.sleep(2000);
	        
	        TermInsurance termInsurance=new TermInsurance (driver);
	        
	        termInsurance.termInsurance1();
	        
	        Thread.sleep(3000);
	        
	        driver.get("https://termlife.policybazaar.com/?utm_content=home_v11");
	        Viewproceed view =new  Viewproceed(driver);
			 
			 view.Gender1();

				Thread.sleep(2000);
			 
				view.name1();
				Thread.sleep(2000);
				 view.dateofbirth1();
				 Thread.sleep(2000);
				 view.mNumber();
				 Thread.sleep(2000);
				 view.view2();
					
	}
	
	
	@Test 
	public void verifyView() throws InterruptedException
	{
		System.out.println("Test _1");
		
        Viewproceed view =new  Viewproceed(driver);
		 
		 view.Gender1();

			Thread.sleep(2000);
		 
			view.name1();
			Thread.sleep(2000);
			 view.dateofbirth1();
			 Thread.sleep(2000);
			 view.mNumber();
			 Thread.sleep(2000);
			 view.view2();
				
		 
		 
		 String actualURL1 =driver.getCurrentUrl();
		 String actualTitle= driver.getTitle();
		 
		 String expectedURL="";
		 String expectedTitle="Term Life Insurance - Compare & Buy Life Insurance Online";
		 
		 if(actualURL1.equals(expectedURL) && actualTitle.equals(expectedTitle))
		 {
			 System.out.println("Passed");
		 }
		 else
		 {
			 System.out.println("Failed");
		 }
		 
		 Thread.sleep(3000);
	}
	
	
	
/*	@Test 
	public void Namefield() throws InterruptedException 
	{
		
		Thread.sleep(2000);
	  Viewproceed view =new  Viewproceed(driver);
		view.name1();
		Thread.sleep(2000);
		 view.dateofbirth1();
		 Thread.sleep(2000);
		 view.mNumber();
		 Thread.sleep(2000);
		 view.view2();
			
	}
	
	
	
	@Test
	public void DateOFBirth()
	{
		  Viewproceed view =new  Viewproceed(driver);
		  view.dateofbirth1();
	}
	
	
	@Test
	public void MobileNo()
	{
		 Viewproceed view =new  Viewproceed(driver);
		 view.mNumber();
	}
	
	@Test
	public void View1()
	{
		 Viewproceed view =new  Viewproceed(driver);
		 view.view2();
	}*/
	
	@AfterMethod 
	public void closedCurrentTab() throws InterruptedException
	{
		System.out.println("closecurrentTab");
		driver.close();
		
		ArrayList<String> addr =new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(addr.get(1));
		
		Thread.sleep(3000);
	}
	
	
    
	@AfterClass 
	public void QuitTab()
	{
		driver.quit();
	}

}