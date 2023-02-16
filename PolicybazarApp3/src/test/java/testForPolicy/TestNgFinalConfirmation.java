package testForPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import policyBazarApp3.FinalConfirmationDetails;

public class TestNgFinalConfirmation {
	WebDriver driver;
	@BeforeClass 
	public void openNewBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\chromedriver.exe");

         driver =new ChromeDriver ();
        driver.manage().window().maximize();
	}
	
	
	@Test
	public void ConfirmationDetails()
	{
		System.out.println("Test_5");
		
		String actualURL =driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedURL="https://health.policybazaar.com/proposer/4?utm_content=home_v12_control";
		String expectedTitle="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
		
		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		FinalConfirmationDetails finalDetails=new FinalConfirmationDetails(driver);
		
		finalDetails.Gender();
		finalDetails.FullName1();
		finalDetails.Mnumber();
		finalDetails.contin3();
	}
	
	

}
