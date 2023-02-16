package testForPolicy;

import java.util.ArrayList;
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
import policyBazarApp3.TermInsurance;
import policyBazarApp3.Viewproceed;


public class PolicyBazar {
	
	WebDriver driver;
	
	@BeforeClass 
	public void openBrowser() throws InterruptedException 
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
	        
	        TermInsurance termInsurance=new TermInsurance (driver);
	        
	        termInsurance.termInsurance1();
	        
	        Thread.sleep(3000);
	        
	        
	        Viewproceed view =new  Viewproceed(driver);
			 
			 view.Gender1();
			 
			 view.name1();
			 view.dateofbirth1();
			 view.mNumber();
			 view.view2();
			 
			 Thread.sleep(3000);
			 
			 HealthInsurance healthInsur=new HealthInsurance(driver);
			 healthInsur.health1();
			 healthInsur.motheroption1();
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
				finalDetails.contin3();
				
				 Thread.sleep(3000);
				
	}
	
	@Test 
	public void verifyView() throws InterruptedException
	{
		System.out.println("Test _1");
		
		
		
	/*	 String actualURL =driver.getCurrentUrl();
		 String actualTitle= driver.getTitle();
		 
		 String expectedURL="https://termlife.policybazaar.com/?utm_content=home_v11";
		 String expectedTitle="Term Life Insurance - Compare & Buy Life Insurance Online";
		 
		 if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		 {
			 System.out.println("Passed");
		 }
		 else
		 {
			 System.out.println("Failed");
		 }*/
     
		 driver.navigate().back();
		 
		 Thread.sleep(3000);
		
	}
	
	@Test 
	public void ClickOnHealthInsurance() throws InterruptedException
	{
		System.out.println("Test_2");
		
		
		
		 String actualURL=driver.getCurrentUrl();
		 String actualTitle=driver.getTitle();
		 
		 String expectedURL="https://health.policybazaar.com/mage/2?utm_content=home_v12_contro";
		 String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		 
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		 Thread.sleep(3000);
		
	}
	
	@Test
	public void DetailedSelfInfo() throws InterruptedException
	{
		System.out.println("Test_3");
		
		String actualURL =driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://health.policybazaar.com/city/3?utm_content=home_v12_control";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		 Thread.sleep(3000);
		
	}
	
	@Test 
	public void CityInfo() throws InterruptedException
	{
		System.out.println("Test_4");
		
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL ="https://health.policybazaar.com/proposer/4?utm_content=home_v12_control";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		 Thread.sleep(3000);
	
	}
	
	@Test
	public void ConfirmationDetails() throws InterruptedException
	{
		System.out.println("Test_5");
	
		/*String actualURL =driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		*/
		 Thread.sleep(3000);
		
	}
	
	@AfterMethod 
	public void CloseTab() throws InterruptedException
	{
		driver.close();
		 Thread.sleep(3000);
	}
	
	@AfterClass
	public void QuitTab()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
