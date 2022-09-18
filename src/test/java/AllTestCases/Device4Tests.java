package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.PageObjects;

public class Device4Tests {

	//FM WhatsApp Tests
	
		@Test(enabled = false)
		public void Device4_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device4FMGroups);
			}
		
		@Test(enabled = false)
		public void Device4_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device4DualFMGroups);
			}
		
		@Test(enabled = false)
		public void Device4_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device4WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false)
			public void Device4_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4GBGroups);
			}
			
			@Test(enabled=false)
			public void Device4_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualGBGroups);
			}
			
			@Test(enabled=false)
			public void Device4_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device4_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4AEROGroups);
			}
			@Test(enabled=false)
			public void Device4_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualAEROGroups);
			}
			@Test(enabled=false)
			public void Device4_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false)
			public void Device4_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4OGGroups);
			}
			@Test(enabled=false)
			public void Device4_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualOGGroups);
			}
			@Test(enabled=false)
			public void Device4_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false)
			public void Device4_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WAGroups);
			}
			@Test(enabled=false)
			public void Device4_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualWAGroups);
			}
			@Test(enabled=false)
			public void Device4_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false)
			public void Device4_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WBGroups);
			}
			@Test(enabled=false)
			public void Device4_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualWBGroups);
			}
			@Test(enabled=false)
			public void Device4_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device4_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4YOGroups);
			}
			@Test(enabled=false)
			public void Device4_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4DualYOGroups);
			}
			@Test(enabled=true)
			public void Device4_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device4WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device4WorkYOGroups);
			}
		
	}
	
	
	

