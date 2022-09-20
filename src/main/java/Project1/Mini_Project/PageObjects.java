package Project1.Mini_Project;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.StringResources;

public class PageObjects {

	
		//WhatsApp QR Code
		public WebElement getQRCode(WebDriver driver)
		{
			WebElement qr=driver.findElement(By.className("_2UwZ_"));
			return qr;	
		}
	
		//WhatsApp Title
		public WebElement getlandingTitle(WebDriver driver)
		{
			WebElement ltitle=driver.findElement(By.className("_3-XoE"));
			return ltitle;	
		}
	
		//Serach Chat Box
		public WebElement chatListSearch(WebDriver driver) 
		{
			WebElement clsearch=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
			return clsearch;
		}
	

		//Waiting unitil search box appears
		public void waitUnitlChatListLoaded(WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Search input textbox']")));

		}
		

		//Copy Message to clipboard
		public void sendmessage(WebDriver driver) throws IOException
		{
			String message=MessageSetter.pickRandomMessage(StringResources.MessagesFolder);
			//Copytoclipboard
			
			StringSelection message_to_send=new StringSelection(message);
    	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    	    clipboard.setContents(message_to_send, null);
			
			driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys(Keys.CONTROL+"V");
		
		}
		
		//search kelelya elementvr click krnyasathi
		public WebElement matchedText(WebDriver driver) 
		{
			WebElement mtext=driver.findElement(By.className("zoWT4"));
			return mtext;
		}
		
		//click on menu button after click on group
		public WebElement selectMenu(WebDriver driver) 
		{
			WebElement smenu=driver.findElement(By.xpath("//div[@data-tab='6']/child::span[@data-testid='menu']"));
			return smenu;
		}
				
	
				
		//after select element send messege into textbox
		public WebElement sendButton(WebDriver driver) 
		{
			 WebElement sbutton=driver.findElement(By.xpath("//span[@data-testid='send']"));
			 return sbutton;
		}		
		
}
