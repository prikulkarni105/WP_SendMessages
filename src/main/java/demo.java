import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.MessageSetter;
import Resources.StringResources;
import io.github.bonigarcia.wdm.WebDriverManager;
import it.auties.whatsapp.api.Whatsapp;
import lombok.var;

public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file//demo added
		
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--user-data-dir=/Users/dhirajkulkarni/Desktop/DemoDataDir");

		//	WebDriver driver=new ChromeDriver(options);
			//driver.get("https://web.whatsapp.com");

		//	System.out.println(driver.getTitle());
			//driver.getTitle();


		
			//
	}

}


