package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.PageObjects;

public class Device5Tests {

	//FM WhatsApp Tests
	
		@Test(enabled = false)
		public void Device5_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device5FMGroups);
			}
		
		@Test(enabled = false)
		public void Device5_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device5DualFMGroups);
			}
		
		@Test(enabled = false)
		public void Device5_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device5WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false)
			public void Device5_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5GBGroups);
			}
			
			@Test(enabled=false)
			public void Device5_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualGBGroups);
			}
			
			@Test(enabled=false)
			public void Device5_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device5_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5AEROGroups);
			}
			@Test(enabled=false)
			public void Device5_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualAEROGroups);
			}
			@Test(enabled=false)
			public void Device5_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false)
			public void Device5_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5OGGroups);
			}
			@Test(enabled=false)
			public void Device5_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualOGGroups);
			}
			@Test(enabled=false)
			public void Device5_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false)
			public void Device5_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WAGroups);
			}
			@Test(enabled=false)
			public void Device5_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualWAGroups);
			}
			@Test(enabled=false)
			public void Device5_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false)
			public void Device5_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WBGroups);
			}
			@Test(enabled=false)
			public void Device5_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualWBGroups);
			}
			@Test(enabled=false)
			public void Device5_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device5_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5YOGroups);
			}
			@Test(enabled=false)
			public void Device5_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5DualYOGroups);
			}
			@Test(enabled=true)
			public void Device5_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device5WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device5WorkYOGroups);
			}
		
	}
	
	
	

