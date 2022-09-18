package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.PageObjects;

public class Device2Tests {

	//FM WhatsApp Tests
	
		@Test(enabled = false)
		public void Device2_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2FMGroups);
			}
		
		@Test(enabled = false)
		public void Device2_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2DualFMGroups);
			}
		
		@Test(enabled = false)
		public void Device2_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false)
			public void Device2_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2GBGroups);
			}
			
			@Test(enabled=false)
			public void Device2_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualGBGroups);
			}
			
			@Test(enabled=false)
			public void Device2_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device2_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2AEROGroups);
			}
			@Test(enabled=false)
			public void Device2_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualAEROGroups);
			}
			@Test(enabled=false)
			public void Device2_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false)
			public void Device2_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2OGGroups);
			}
			@Test(enabled=false)
			public void Device2_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualOGGroups);
			}
			@Test(enabled=false)
			public void Device2_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false)
			public void Device2_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WAGroups);
			}
			@Test(enabled=false)
			public void Device2_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualWAGroups);
			}
			@Test(enabled=false)
			public void Device2_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false)
			public void Device2_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WBGroups);
			}
			@Test(enabled=false)
			public void Device2_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualWBGroups);
			}
			@Test(enabled=false)
			public void Device2_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device2_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2YOGroups);
			}
			@Test(enabled=false)
			public void Device2_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualYOGroups);
			}
			@Test(enabled=true)
			public void Device2_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device2WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkYOGroups);
			}
		
	}
	
	
	

