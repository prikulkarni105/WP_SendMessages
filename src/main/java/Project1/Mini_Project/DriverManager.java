package Project1.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager
{
	

	public WebDriver startDriver(String browserName, String url, String chromeProfilePath, String firefoxProfilePath ) 
	{
		
		
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--user-data-dir="+chromeProfilePath);
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(option);
			driver.get(url);
			return driver;
		}
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\patil\\Desktop\\Selenium\\chromedriver.exe");
		if (browserName.equalsIgnoreCase("firefox")) 
		//else
		{
			WebDriverManager.firefoxdriver().setup();
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile myprofile = profile.getProfile(firefoxProfilePath);
			FirefoxOptions options=new FirefoxOptions();
			options.setProfile(myprofile);
			WebDriver driver=new FirefoxDriver(options);
			driver.get(url);
			return driver;
		}
		
		
		return null;
		
	}
	
	
	public static void tearDown(WebDriver driver) 
	{
		driver.quit();
	}
	
}
