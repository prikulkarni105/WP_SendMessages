package Project1.Mini_Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MessageSetter {

	

	public static String pickRandomMessage(String messageFolder) throws IOException
	{
		Random rd=new Random();
		String messagefile[]=new String[5];
		String path=messageFolder;
		
		messagefile[0]="1.txt";
		messagefile[1]="2.txt";
		messagefile[2]="3.txt";
		messagefile[3]="4.txt";
		messagefile[4]="5.txt";
		
		int random = rd.nextInt(messagefile.length);
		
	  //  System.out.println(path+message[random]);
	    
	    String filepath=path+messagefile[random];
	    
	    
	    /* THis is for local filesystem
	    File randomfile=new File(filepath);
	    Scanner sc=new Scanner(randomfile);
	    String message="";
		    while (sc.hasNext()) 
		    {
		    	message=message+"\n"+sc.nextLine();
				
			}
			sc.close();
			return message;
			*/
	    
	      URL fileurl = new URL(filepath);
		  BufferedReader br = new BufferedReader(new InputStreamReader(fileurl.openStream()));
		  String inputline;

		  String message="";
			   while ((inputline = br.readLine()) != null)
			     	{
			    	message=message+"\n"+inputline;

			     	}
	 
		 return message;
	    
	    
		}
	
}
