package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.PageObjects;

public class Device3Tests {

	//FM WhatsApp Tests
	
		@Test(enabled = false)
		public void Device3_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3FMGroups);
			}
		
		@Test(enabled = false)
		public void Device3_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3DualFMGroups);
			}
		
		@Test(enabled = false)
		public void Device3_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false)
			public void Device3_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3GBGroups);
			}
			
			@Test(enabled=false)
			public void Device3_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualGBGroups);
			}
			
			@Test(enabled=false)
			public void Device3_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device3_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3AEROGroups);
			}
			@Test(enabled=false)
			public void Device3_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualAEROGroups);
			}
			@Test(enabled=false)
			public void Device3_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false)
			public void Device3_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3OGGroups);
			}
			@Test(enabled=false)
			public void Device3_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualOGGroups);
			}
			@Test(enabled=false)
			public void Device3_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false)
			public void Device3_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WAGroups);
			}
			@Test(enabled=false)
			public void Device3_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualWAGroups);
			}
			@Test(enabled=false)
			public void Device3_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false)
			public void Device3_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WBGroups);
			}
			@Test(enabled=false)
			public void Device3_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualWBGroups);
			}
			@Test(enabled=false)
			public void Device3_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device3_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3YOGroups);
			}
			@Test(enabled=false)
			public void Device3_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualYOGroups);
			}
			@Test(enabled=true)
			public void Device3_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device3WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkYOGroups);
			}
		
	}
	
	
	

