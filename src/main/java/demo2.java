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
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.MessageSetter;
import Resources.StringResources;
import io.github.bonigarcia.wdm.WebDriverManager;


public class demo2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file//demo added
		
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--user-data-dir=/Users/dhirajkulkarni/Desktop/DemoDataDir");
			options.addExtensions(new File("/Users/dhirajkulkarni/Desktop/demo.crx"));
			WebDriver driver=new ChromeDriver(options);
			driver.get("https://web.whatsapp.com");
			//Thread.sleep(25000);

			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(150));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("css-p3bvdo")));
			
			driver.findElement(By.className("css-p3bvdo")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='Export Contacts']")).click();
			Thread.sleep(2000);
			List <WebElement> groupArrayList= driver.findElements(By.className("css-notc4y"));
			for (WebElement webElement : groupArrayList) {
				System.out.println(webElement.getText());
			}
			driver.quit();

			//
	}

}


