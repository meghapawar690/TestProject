package testForPolicy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazarApp3.FinalConfirmationDetails;
import policyBazarApp3.HealthInsurance;
import policyBazarApp3.LocationDetails;
import policyBazarApp3.PersonalDetails;

public class TestNgHealthInsure {
	
	WebDriver driver;
	@BeforeClass
	public void openNewBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\chromedriver.exe");

         driver =new ChromeDriver ();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
	}
	
	@BeforeMethod
	public void LounchApplication() throws InterruptedException
	{
		 driver.get("https://www.policybazaar.com/");
	        
	        Thread.sleep(2000);
	        
		 HealthInsurance healthInsur=new HealthInsurance(driver);
			 healthInsur.health1();
			
			/* healthInsur.motheroption1();
			healthInsur.continu1();
			 	
			 Thread.sleep(3000);
			 
			 PersonalDetails pDetails=new PersonalDetails(driver);
			 pDetails.selfAge1();
			 pDetails.motherAge1();
			 pDetails.cont();
			 
			 Thread.sleep(3000);
			 
			 LocationDetails cityinfo=new LocationDetails(driver);
				cityinfo.cityname();
				 Thread.sleep(3000);
				 
			 FinalConfirmationDetails finalDetails=new FinalConfirmationDetails(driver);
					
				finalDetails.Gender();
				finalDetails.FullName1();
				finalDetails.Mnumber();
				finalDetails.contin3();*/
					
			 Thread.sleep(3000);
					
		}
			 
		
			
	

	@Test(priority=1)
	public void HealthInsurPage() throws InterruptedException
	{
	    System.out.println("Test_1");
	    HealthInsurance healthInsur=new HealthInsurance(driver);
	    
	    healthInsur.motheroption1();
		 healthInsur.continu1();
		 
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 String expURL="";
		 String expTitle="";
		 
		 
				 
	
		 Thread.sleep(3000);
		 
		 PersonalDetails pDetails=new PersonalDetails(driver);
		 pDetails.selfAge1();
		 pDetails.motherAge1();
		 pDetails.cont();
		 
		 Thread.sleep(3000);
		 
		 LocationDetails cityinfo=new LocationDetails(driver);
			cityinfo.cityname();
			 Thread.sleep(3000);
			 
		 FinalConfirmationDetails finalDetails=new FinalConfirmationDetails(driver);
				
			finalDetails.Gender();
			finalDetails.FullName1();
			finalDetails.Mnumber();
			finalDetails.contin3();
				
		 Thread.sleep(3000);
		
	    String actualURL =driver.getCurrentUrl();
	    System.out.println( actualURL);
	    String actualTitle=driver.getTitle();
	    System.out.println(actualTitle);
	  
		 String expectedURL="https://health.policybazaar.com/?&utm_content=home_v12_control";
		 String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		 
		if(actualURL.equals(expectedURL) || actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		 Thread.sleep(3000);
	    
	}
			 
			 
	
		
		
	
		
		
		
}	

