package Project1.Mini_Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginValidation {


	public static Boolean validateUrl(WebDriver driver, String expectedUrl)
	{
		
		String URL=driver.getCurrentUrl();
		if (URL.equals(expectedUrl)) {
			
			return true;			
		}
		else
		{
			return false;			
		}
	
	}
	
	public static Boolean checkLLogin(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageObjects pobj=new PageObjects();
		WebElement qr=null;
		try {
		 qr=pobj.getQRCode(driver);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
			if (qr!=null) 
			{
			
				return false;
				//scan qr
				//reload methos
				
			}
			else  
			{
		    pobj.waitUnitlChatListLoaded(driver);
			return true;
	        
			}
		
			
	}
	
}
