package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseBrowser {
	
	
	public static WebDriver  openChromeBrowser() 
	{
		System.out.println("BeforeClassChrome");
        System.setProperty("webdriver.chrome.driver",
	             	"E:\\selenium\\chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        return driver;
	}
	
	
	/*public static WebDriver  openFirefoxBrowser() 
	{
		System.out.println("BeforeClassChrome");
        System.setProperty("webdriver.gecko.driver",
	             	"E:\\selenium\\geckodriver-v0.32.1-win32\\geckodriver.exe");

        WebDriver driver =new FirefoxDriver();
        return driver;
	}
	*/
	
	public static WebDriver  openEdgeaBrowser() 
	{
		System.out.println("BeforeClassEdge");
        System.setProperty("webdriver.edge.driver",
	             	"C:\\Users\\Megha\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver =new EdgeDriver();
        return driver;
	}
	
	
	
	
	

}
