package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.PageObjects;

public class Device1Tests {

	
	//Demotest
	
	@Test
	public void demoTest() throws FileNotFoundException {
		
		int i=GetChatlist.getChatListFromLocalFile(StringResources.Device1FMGroups).size();
	System.out.println(i);
	}
	
	//FM WhatsApp Tests
	//karto hara change
		@Test(enabled = true, priority=1)
		public void Device1_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1FMChromeProfile, StringResources.Device1FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device1FMGroups);
			}
		
		@Test(enabled = true,  priority=2)
		public void Device1_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualFMChromeProfile, StringResources.Device1DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device1DualFMGroups);
			}
		
		@Test(enabled = true,  priority=3)
		public void Device1_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkFMChromeProfile, StringResources.Device1WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device1WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=true, priority=4)
			public void Device1_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1GBChromeProfile, StringResources.Device1GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1GBGroups);
			}
			
			@Test(enabled=true, priority=5)
			public void Device1_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualGBChromeProfile, StringResources.Device1DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualGBGroups);
			}
			
			@Test(enabled=false, priority=6)
			public void Device1_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkGBChromeProfile, StringResources.Device1WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=true, priority=7)
			public void Device1_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1AEROChromeProfile, StringResources.Device1AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1AEROGroups);
			}
			@Test(enabled=true, priority=8)
			public void Device1_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualAEROChromeProfile, StringResources.Device1DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualAEROGroups);
			}
			@Test(enabled=true, priority=9)
			public void Device1_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkAEROChromeProfile, StringResources.Device1WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false, priority=10)
			public void Device1_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1OGChromeProfile, StringResources.Device1OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1OGGroups);
			}
			@Test(enabled=false, priority=11)
			public void Device1_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualOGChromeProfile, StringResources.Device1DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualOGGroups);
			}
			@Test(enabled=false, priority=12)
			public void Device1_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkOGChromeProfile, StringResources.Device1WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=true, priority=13)
			public void Device1_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WAChromeProfile, StringResources.Device1WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WAGroups);
			}
			@Test(enabled=true, priority=14)
			public void Device1_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualWAChromeProfile, StringResources.Device1DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualWAGroups);
			}
			@Test(enabled=true, priority=15)
			public void Device1_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkWAChromeProfile, StringResources.Device1WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=true, priority=16)
			public void Device1_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WBChromeProfile, StringResources.Device1WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WBGroups);
			}
			@Test(enabled=true, priority=17)
			public void Device1_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualWBChromeProfile, StringResources.Device1DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualWBGroups);
			}
			@Test(enabled=false, priority=18)
			public void Device1_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkWBChromeProfile, StringResources.Device1WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=true, priority=19)
			public void Device1_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1YOChromeProfile, StringResources.Device1YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1YOGroups);
			}
			@Test(enabled=true, priority=20)
			public void Device1_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1DualYOChromeProfile, StringResources.Device1DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1DualYOGroups);
			}
			@Test(enabled=false, priority=21)
			public void Device1_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, StringResources.Device1WorkYOChromeProfile, StringResources.Device1WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device1WorkYOGroups);
			}
		
	}
	
	
	

