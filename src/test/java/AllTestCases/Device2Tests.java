package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.PageObjects;

public class Device2Tests {

	
	
	
	//FM WhatsApp Tests
	//karto hara change
		@Test(enabled = true, priority=1)
		public void Device2_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2FMChromeProfile, StringResources.Device2FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2FMGroups);
			}
		
		@Test(enabled = false,  priority=2)
		public void Device2_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualFMChromeProfile, StringResources.Device2DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2DualFMGroups);
			}
		
		@Test(enabled = false,  priority=3)
		public void Device2_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkFMChromeProfile, StringResources.Device2WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device2WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false, priority=4)
			public void Device2_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2GBChromeProfile, StringResources.Device2GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2GBGroups);
			}
			
			@Test(enabled=false, priority=5)
			public void Device2_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualGBChromeProfile, StringResources.Device2DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualGBGroups);
			}
			
			@Test(enabled=false, priority=6)
			public void Device2_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkGBChromeProfile, StringResources.Device2WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false, priority=7)
			public void Device2_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2AEROChromeProfile, StringResources.Device2AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2AEROGroups);
			}
			@Test(enabled=false, priority=8)
			public void Device2_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualAEROChromeProfile, StringResources.Device2DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualAEROGroups);
			}
			@Test(enabled=false, priority=9)
			public void Device2_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkAEROChromeProfile, StringResources.Device2WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false, priority=10)
			public void Device2_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2OGChromeProfile, StringResources.Device2OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2OGGroups);
			}
			@Test(enabled=false, priority=11)
			public void Device2_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualOGChromeProfile, StringResources.Device2DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualOGGroups);
			}
			@Test(enabled=false, priority=12)
			public void Device2_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkOGChromeProfile, StringResources.Device2WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false, priority=13)
			public void Device2_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WAChromeProfile, StringResources.Device2WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WAGroups);
			}
			@Test(enabled=false, priority=14)
			public void Device2_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualWAChromeProfile, StringResources.Device2DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualWAGroups);
			}
			@Test(enabled=false, priority=15)
			public void Device2_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkWAChromeProfile, StringResources.Device2WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false, priority=16)
			public void Device2_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WBChromeProfile, StringResources.Device2WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WBGroups);
			}
			@Test(enabled=false, priority=17)
			public void Device2_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualWBChromeProfile, StringResources.Device2DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualWBGroups);
			}
			@Test(enabled=false, priority=18)
			public void Device2_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkWBChromeProfile, StringResources.Device2WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false, priority=19)
			public void Device2_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2YOChromeProfile, StringResources.Device2YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2YOGroups);
			}
			@Test(enabled=false, priority=20)
			public void Device2_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2DualYOChromeProfile, StringResources.Device2DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2DualYOGroups);
			}
			@Test(enabled=false, priority=21)
			public void Device2_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device2WorkYOChromeProfile, StringResources.Device2WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device2WorkYOGroups);
			}
		
	}
	
	
	

