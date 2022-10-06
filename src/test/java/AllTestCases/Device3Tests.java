package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.PageObjects;

public class Device3Tests {

	
	
	
	//FM WhatsApp Tests
	//karto hara change
		@Test(enabled = false, priority=1)
		public void Device3_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3FMChromeProfile, StringResources.Device3FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3FMGroups);
			}
		
		@Test(enabled = false,  priority=2)
		public void Device3_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualFMChromeProfile, StringResources.Device3DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3DualFMGroups);
			}
		
		@Test(enabled = true,  priority=3)
		public void Device3_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkFMChromeProfile, StringResources.Device3WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device3WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=true, priority=4)
			public void Device3_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3GBChromeProfile, StringResources.Device3GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3GBGroups);
			}
			
			@Test(enabled=true, priority=5)
			public void Device3_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualGBChromeProfile, StringResources.Device3DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualGBGroups);
			}
			
			@Test(enabled=true, priority=6)
			public void Device3_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkGBChromeProfile, StringResources.Device3WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=true, priority=7)
			public void Device3_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3AEROChromeProfile, StringResources.Device3AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3AEROGroups);
			}
			@Test(enabled=true, priority=8)
			public void Device3_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualAEROChromeProfile, StringResources.Device3DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualAEROGroups);
			}
			@Test(enabled=true, priority=9)
			public void Device3_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkAEROChromeProfile, StringResources.Device3WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=true, priority=10)
			public void Device3_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3OGChromeProfile, StringResources.Device3OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3OGGroups);
			}
			@Test(enabled=true, priority=11)
			public void Device3_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualOGChromeProfile, StringResources.Device3DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualOGGroups);
			}
			@Test(enabled=true, priority=12)
			public void Device3_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkOGChromeProfile, StringResources.Device3WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=true, priority=13)
			public void Device3_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WAChromeProfile, StringResources.Device3WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WAGroups);
			}
			@Test(enabled=true, priority=14)
			public void Device3_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualWAChromeProfile, StringResources.Device3DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualWAGroups);
			}
			@Test(enabled=true, priority=15)
			public void Device3_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkWAChromeProfile, StringResources.Device3WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=true, priority=16)
			public void Device3_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WBChromeProfile, StringResources.Device3WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WBGroups);
			}
			@Test(enabled=true, priority=17)
			public void Device3_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualWBChromeProfile, StringResources.Device3DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualWBGroups);
			}
			@Test(enabled=true, priority=18)
			public void Device3_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkWBChromeProfile, StringResources.Device3WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=true, priority=19)
			public void Device3_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3YOChromeProfile, StringResources.Device3YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3YOGroups);
			}
			@Test(enabled=true, priority=20)
			public void Device3_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3DualYOChromeProfile, StringResources.Device3DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3DualYOGroups);
			}
			@Test(enabled=true, priority=21)
			public void Device3_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device3WorkYOChromeProfile, StringResources.Device3WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device3WorkYOGroups);
			}
		
	}
	
	
	

