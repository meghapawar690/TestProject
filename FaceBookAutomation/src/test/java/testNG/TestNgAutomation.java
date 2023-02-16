package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BaseBrowser;
import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class TestNgAutomation {
	
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser1(String browserName) {
		
		
		if(browserName.equals("Chrome"))
		{
		  driver=BaseBrowser.openChromeBrowser();
	    }
		
	/*	if(browserName.equals("Firefox"))
		{
			driver=BaseBrowser.openFirefoxBrowser();
	    }*/
		
		if(browserName.equals("Edge"))
		{
		  driver=BaseBrowser.openEdgeaBrowser();
	    }
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
		
	}
	
	
		
		
		
	@BeforeMethod
	public void openSignUp1()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
		loginOrSignUpPage.clickCreatenewacc();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	}
	
	@Test	
	public void signupPage1() {
		System.out.println("Test A");
		SignUpPage signUpPage=new SignUpPage(driver);
		signUpPage.clickOntermsCondition();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Actual url is "+actualUrl);
		String actualTitle=driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		/*String expUrl="https://www.facebook.com/legal/terms/update";
		String expTitle="Facebook";
		
		
		Assert.assertEquals( actualUrl, expUrl, "Url is correct");
		Assert.assertEquals( actualTitle, expTitle, "Title is correct");
		
		boolean result =actualTitle.equals(expTitle);
		
		boolean result1=actualUrl.equals(expUrl);
		
		Assert.assertTrue(result);*/
		
		
		/*if(actualUrl.equals(expUrl) && actualTitle.equals(expTitle))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}*/
	}
	@Test	/*(priority = 2 , dependsOnMethods= {"signupPage"}, invocationCount=2)*/
	public void privacyPolicy()
	{
		System.out.println("Test B");
		SignUpPage signUpPage=new SignUpPage(driver);
		signUpPage.clickOnPrivacyPolicy();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		String actualUrl=driver.getCurrentUrl();
		System.out.println("Actual url is "+actualUrl);
		String actualTitle=driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		String expUrl  ="https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0";
		String expTitle="Meta Privacy Policy – How Meta collects and uses user data | Privacy Centre | Manage your privacy on Facebook, Instagram and Messenger | Facebook Privacy";
		if(actualUrl.equals(expUrl) && actualTitle.equals(expTitle))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}
	}
	
	@AfterMethod
	public void closeCurrentTab1()
	{
		System.out.println("After Method");
		driver.close();
		ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void closeAllTab1()
	{
		System.out.println("After Class");
		driver.quit();
	}

}
