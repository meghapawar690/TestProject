package testForPolicy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazarApp3.LocationDetails;

public class TestNgLocationDetails {

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
	public void LounchNewTab() throws InterruptedException
	{
		driver.get("https://health.policybazaar.com/city/3?utm_content=home_v12_control");
		
		Thread.sleep(3000);
	
		LocationDetails cityinfo=new LocationDetails(driver);
		cityinfo.cityname();
	}
	
	@Test 
	public void CityInfo()
	{
		System.out.println("Test_4");
		
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL ="https://health.policybazaar.com/city/4?utm_content=home_v12_control";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
	
	}
	
	@AfterMethod 
	public void CloseTab()
	{
		driver.close();
	}
	
	@AfterClass
	public void QuitTab()
	{
		driver.quit();
	}
}
