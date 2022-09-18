package Project1.Mini_Project;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Resources.StringResources;

public class PageObjects {

	
	
	//Web.whatsapp.com login QR
		public WebElement getQRCode(WebDriver driver)
		{
			WebElement qr=driver.findElement(By.className("_2UwZ_"));
			return qr;	
		}
	
	//Web.whatsapp.com Title On Page
		public WebElement getlandingTitle(WebDriver driver)
		{
			WebElement ltitle=driver.findElement(By.className("_3-XoE"));
			return ltitle;	
		}
	
	//chatbox vr click krnyasathi 
		public WebElement chatListSearch(WebDriver driver) 
		{
			WebElement clsearch=driver.findElement(By.xpath("//div[@title='Search input textbox']"));
			return clsearch;
		}
	

		public void waitUnitlChatListLoaded(WebDriver driver)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Search input textbox']")));

		}
		
		//input search kraycha data change kru shakto
		public void sendkeys(WebDriver driver) 
		{
			driver.findElement(By.xpath("//div[@title='Search input textbox']")).sendKeys("dk");
		}
		
		
		//message different send kru shakato
		public void sendmessage(WebDriver driver) throws FileNotFoundException
		{
			driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys(MessageSetter.pickRandomMessage(StringResources.MessagesFolder));
			//driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("Hi");
		
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
		public WebElement sendMessage(WebDriver driver) 
		{
			 WebElement smessage=driver.findElement(By.xpath("//div[@title='Type a message']"));
			 return smessage;
		} 
				
	//after select element send messege into textbox
		public WebElement sendButton(WebDriver driver) 
		{
			 WebElement sbutton=driver.findElement(By.xpath("//span[@data-testid='send']"));
			 return sbutton;
		}		
		
}
