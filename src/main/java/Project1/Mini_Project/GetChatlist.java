package Project1.Mini_Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetChatlist {

	
	//This method returns list of string from local file
	public static ArrayList<String> getChatListFromLocalFile(String localFilePath) throws FileNotFoundException
		{
			File localfile=new File(localFilePath);
			Scanner sc=new Scanner(localfile);
			ArrayList<String> chatlist=new ArrayList<String>();
				while (sc.hasNext()) 
				{
					chatlist.add(sc.nextLine());
				}
			sc.close();
			return chatlist;
		}
	
	//This method returns list of string from remote url
	public static ArrayList<String> getChatListFromURL(String remoteFileUrl) throws IOException
		{
			  URL fileurl = new URL(remoteFileUrl);
			  BufferedReader br = new BufferedReader(new InputStreamReader(fileurl.openStream()));
			  String inputline;
			  ArrayList<String> chatlist = new ArrayList<String>();
			  
				   while ((inputline = br.readLine()) != null)
				     	{
					   			chatlist.add(inputline);
				     	}
		 
			 return chatlist;
				   
		}
	
	public static List<String> getChatListFromExtension(WebDriver driver) throws IOException, InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-p3bvdo")));
		
		driver.findElement(By.className("css-p3bvdo")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Export Contacts']")).click();
		Thread.sleep(2000);
		List<WebElement> groupArrayList= driver.findElements(By.className("css-notc4y"));
		
		System.out.println("****************"+groupArrayList.size()+"********************");
		
		List<String> finalNames = null;
		
		for (WebElement webelement : groupArrayList) {
			
			finalNames.add(webelement.getText());
			
		}
		
		return finalNames;
		
	}
}
