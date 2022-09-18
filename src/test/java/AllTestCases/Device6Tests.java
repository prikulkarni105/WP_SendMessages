package AllTestCases;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Project1.Mini_Project.SendLogic;
import Resources.StringResources;
import Project1.Mini_Project.DriverManager;
import Project1.Mini_Project.PageObjects;

public class Device6Tests {

	//FM WhatsApp Tests
	
		@Test(enabled = false)
		public void Device6_FM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6FM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device6FMGroups);
			}
		
		@Test(enabled = false)
		public void Device6_DUALFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device6DualFMGroups);
			}
		
		@Test(enabled = false)
		public void Device6_WORKFM_Test() throws InterruptedException, FileNotFoundException 
		    {
			DriverManager id=new DriverManager();
			WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkFM);
			SendLogic msend=new SendLogic();
			msend.sendTextMessage(driver, StringResources.Device6WorkFMGroups);
			}
		
	//GB WhatsApp Tests
	
			@Test(enabled=false)
			public void Device6_GB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6GB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6GBGroups);
			}
			
			@Test(enabled=false)
			public void Device6_DUALGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualGBGroups);
			}
			
			@Test(enabled=false)
			public void Device6_WORKGB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkGB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkGBGroups);
			}
			
  //AERO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device6_AERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6AERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6AEROGroups);
			}
			@Test(enabled=false)
			public void Device6_DUALAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualAEROGroups);
			}
			@Test(enabled=false)
			public void Device6_WORKAERO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkAERO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkAEROGroups);
			}
			
  //OG WhatsApp Tests
			
			@Test(enabled=false)
			public void Device6_OG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6OG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6OGGroups);
			}
			@Test(enabled=false)
			public void Device6_DUALOG_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualOGGroups);
			}
			@Test(enabled=false)
			public void Device6_WORKOG_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkOG);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkOGGroups);
			}
			
  //WA WhatsApp Tests
			
			@Test(enabled=false)
			public void Device6_WA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WAGroups);
			}
			@Test(enabled=false)
			public void Device6_DUALWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualWAGroups);
			}
			@Test(enabled=false)
			public void Device6_WORKWA_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkWA);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkWAGroups);
			}
  //WB WhatsApp Tests
			
			@Test(enabled=false)
			public void Device6_WB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WBGroups);
			}
			@Test(enabled=false)
			public void Device6_DUALWB_Test()throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualWBGroups);
			}
			@Test(enabled=false)
			public void Device6_WORKWB_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkWB);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkWBGroups);
			}
			
  //YO WhatsApp Tests
			
			@Test(enabled=false)
			public void Device6_YO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6YO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6YOGroups);
			}
			@Test(enabled=false)
			public void Device6_DUALYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6DualYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6DualYOGroups);
			}
			@Test(enabled=true)
			public void Device6_WORKYO_Test() throws InterruptedException, FileNotFoundException 
		    {
				DriverManager id=new DriverManager();
				WebDriver driver  = id.startDriver(StringResources.browserName, StringResources.Url, "", StringResources.Device6WorkYO);
				SendLogic msend=new SendLogic();
				msend.sendTextMessage(driver, StringResources.Device6WorkYOGroups);
			}
		
	}
	
	
	

