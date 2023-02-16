package testForPolicy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazarApp3.HealthInsurance;
import policyBazarApp3.PersonalDetails;

public class TestNgPersonalDetail {
	
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
	public void LounchAppNew() throws InterruptedException
	{
		System.out.println("LounchApp");
		
		driver.get("https://www.policybazaar.com/");
	
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
		
		driver.get("https://health.policybazaar.com/?&utm_content=home_v12_control");
		 HealthInsurance healthInsur=new HealthInsurance(driver);
		 healthInsur.motheroption1();
		 healthInsur.continu1();
		
		
		ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
		
		 driver.get("https://health.policybazaar.com/mage/2?utm_content=home_v12_control");
		 
		Thread.sleep(3000);
	   
		PersonalDetails pDetails=new PersonalDetails(driver);
		
		Thread.sleep(3000);
		
		 pDetails.selfAge1();
		 
		Thread.sleep(3000);
		 pDetails.motherAge1();
		 
		Thread.sleep(3000);
		 pDetails.cont();
		 
		 Thread.sleep(3000);
	}
	
	
	@Test
	public void DetailedSelfInfo() throws InterruptedException
	{
		System.out.println("Test_3");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title =driver.getTitle();
		System.out.println(title);
		
		String actualURL =driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://health.policybazaar.com/city/3?utm_content=home_v12_control";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		Thread.sleep(3000);
		
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
	
	@AfterMethod
	public void TabCloseCureent1() throws InterruptedException
	{
        driver.close();
    	System.out.println("TabClosedCurrent1");
    	
    	Thread.sleep(3000);
	}
	
	@AfterMethod
	public void QuitTab()
	{
		driver.quit();
		
		System.out.println();
	}

}
