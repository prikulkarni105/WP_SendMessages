package Project1.Mini_Project;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SendLogic {

	@Test
	public void sendTextMessage(WebDriver driver, String groupNameUrl ) throws InterruptedException, FileNotFoundException
	{
		PageObjects msend=new PageObjects();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.manage().window().maximize();
		
		//String expectedUrl = "";
		//demo
		
		/*
		if (NetworkManager.netIsAvailable()==false)
		{
			//logic to give a error message to user
	
		}
		
		if (LoginValidation.validateUrl(driver, expectedUrl)==false) 
		{
			//logic to nevigate to expected url
		}
		
		if (LoginValidation.checkLLogin(driver)==false) 
		{
			//logic to handle loggedout sessions
		}
		*/
		msend.waitUnitlChatListLoaded(driver);
		
		ArrayList<String> chatnames=GetChatlist.getChatListFromLocalFile(groupNameUrl);
		
		int i=1;
	
		for (String string : chatnames)
		{
			
			try 
			{
				if(i%5==0)
				{
					Thread.sleep(20000);
				}
				i++;
				
		        msend.chatListSearch(driver).click();
		        Thread.sleep(1000);
		        msend.chatListSearch(driver).clear();
		        Thread.sleep(1000);
	            msend.chatListSearch(driver).sendKeys(string);
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
				continue;
			}
			
		}
	   //To close your driver
	  DriverManager.tearDown(driver);
		
	}
	
	
	
}
