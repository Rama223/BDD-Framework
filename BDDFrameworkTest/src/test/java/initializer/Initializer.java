package initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initializer {

	
	public static WebDriver wd=null;
	public static FileInputStream locatorFis=null;
	public static Properties locatorProp=null;
	public static void initailize(String browser) throws IOException{
		
		 locatorFis=new FileInputStream(new File(System.getProperty("user.dir") + "//src//test//resources//config//locator.properties"));
		 locatorProp=new Properties();
		locatorProp.load(locatorFis);
		
		
		if(wd==null){
		if(browser.equals("firefox")){
			wd=new FirefoxDriver();
		} else if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//lib//chromedriver.exe");
			wd=new ChromeDriver();
		} else if (browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//lib//IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}
		}
		/*******The below code is varies depending upon th network page load time added by vasanth********/
		//wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
	}
	
	public static WebElement getWebelementByXpath(String xpath){
		return 	wd.findElement(By.xpath(locatorProp.getProperty(xpath)));
		
	}
}
