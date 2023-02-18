package testForPolicy;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import policyBazarApp3.TermInsurance;
import policyBazarApp3.Viewproceed;
import utilities.UtilityExcelData;


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
	       
	        
	       
	}
	
	@Test (dataProvider="TermInsure")
	public void verifyView() throws InterruptedException
	{
		System.out.println("verifyview");
		
		 
        TermInsurance termInsurance=new TermInsurance (driver);
        String actText=termInsurance.termInsurance1("Test1");

		System.out.println("Actual text is " + actText);
		String expText ="Term Life Insurance";
		
		if (expText.equals(actText))
		{
			System.out.println("Actual text and Expected text are same " + actText);
		}
		else
		{
			System.out.println("Actual text is not same as expected text ");
		}
       
        Viewproceed view =new  Viewproceed(driver);
			 
			 view.Gender1();
			 
			 view.name1();
			 view.dateofbirth1();
			 view.mNumber();
			 view.view2();
			 
			 Thread.sleep(3000);
			
			 
		
		 String actualURL =driver.getCurrentUrl();
		 String actualTitle= driver.getTitle();
		 
		 String expectedURL="https://termlife.policybazaar.com/?utm_content=home_v11";
		 String expectedTitle="Term Life Insurance - Compare & Buy Life Insurance Online";
		 
		 if(actualURL.equals(expectedURL) || actualTitle.equals(expectedTitle))
		 {
			 System.out.println("Passed");
		 }
		 else
		 {
			 System.out.println("Failed");
		 }
     
		
	}


	 @DataProvider(name="TermInsure")
	 public String [][]getData() throws IOException
	 {
		
		 
		 
		 
		 String termData[][]= {
			{"Megha","06-03-1997",	"7276844423","Valid"},
			{"Mohini","26-04-1969","9865847219"," Invalid"},
			{"Mahesh","19-06-1987","7859642385","Invalid"},
			{" Maruti","01-06-1956","9856854757	","Invalid"}
			
	};
		 return termData;
		 
		 
		 
		 
		 
		 
	/*	 String path="C:\\Users\\Megha\\eclipse-workspace\\ExcelSheetAutomation\\datafiles\\termInsu";
		 UtilityExcelData util=new  UtilityExcelData(path);
		 
		 int totalrow=util.getRowCount("Sheet1");
		 int totalcolm=util.getCellCount("Sheet1", 1);
		 
		 String termData[][]=new String [totalrow][totalcolm];
		 
		 for(int i=1; i<=totalrow; i++)
		 {
			 for(int j=0; j<totalcolm; j++)
			 {
				 termData[i-1][j]=util.getCellData("Sheet1", i, j) ;
			 }
		 }
		 return termData;*/
	 }
	
	 @AfterClass
		void tearDown()
		{
			driver.close();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
