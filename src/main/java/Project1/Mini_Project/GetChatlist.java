package Project1.Mini_Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class GetChatlist {

	
	//This method returns list of string from local file
	public static ArrayList<String> getChatListFromLocalFile(String localFilePath) throws FileNotFoundException
		{
			File localfile=new File(localFilePath);
			Scanner sc=new Scanner(localfile);
			ArrayList<String> chatlist=new ArrayList<String>();
				while (sc.hasNext()) 
				{
					chatlist.add(sc.nextLine());
				}
			sc.close();
			return chatlist;
		}
	
	//This method returns list of string from remote url
	public static ArrayList<String> getChatListFromURL(String remoteFileUrl) throws IOException
		{
			  URL fileurl = new URL(remoteFileUrl);
			  BufferedReader br = new BufferedReader(new InputStreamReader(fileurl.openStream()));
			  String inputline;
			  ArrayList<String> chatlist = new ArrayList<String>();
			  
				   while ((inputline = br.readLine()) != null)
				     	{
					   			chatlist.add(inputline);
				     	}
		 
			 return chatlist;
				   
		}
}
