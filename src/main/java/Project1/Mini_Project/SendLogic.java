package Project1.Mini_Project;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SendLogic {

	@Test
	public void sendTextMessage(WebDriver driver, String groupNameUrl ) throws InterruptedException, FileNotFoundException
	{
		PageObjects msend=new PageObjects();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		msend.waitUnitlChatListLoaded(driver);
		
		
		//Get Chat List From WhatsApp Web Via Extension
		List<String> chatnames=null;
		try {
		 chatnames=GetChatlist.getChatListFromExtension(driver);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			chatnames=null;
		}
		
		System.out.println("**************************Total Groups ---"+chatnames.size()+"************************");

			

		System.out.println(groupNameUrl);
		

		int i=1;
	
		for (String groupNameWebElement : chatnames)
		{

			System.out.println("****************GroupName ---"+groupNameWebElement+"****************");
			try 
			{
				if(i%5==0)
				{
					Thread.sleep(15000);
				}
				i++;
				
		        msend.chatListSearch(driver).click();
		        Thread.sleep(1000);
		        msend.chatListSearch(driver).clear();
		        Thread.sleep(1000);
	          //  msend.chatListSearch(driver).sendKeys(groupNameWebElement);
		        msend.sendGroupName(driver,groupNameWebElement);
	    	    Thread.sleep(1000);
	    	    msend.matchedText(driver).click();
	    	    Thread.sleep(1000);
	    	    msend.sendmessage(driver);
	    	    Thread.sleep(1000);
	    	    msend.sendButton(driver).click();
	    	    Thread.sleep(2000);
	    	    
	    	    
			}
			catch (Exception e) 
			{
				System.out.println("****************Exception ----"+e.getLocalizedMessage()+"****************");

				continue;
			}
			
		}
	   //To close your driver
		
		System.out.println("****************Quitting****************");

	  DriverManager.tearDown(driver);

	}
	
	
	
}
