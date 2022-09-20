import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import Project1.Mini_Project.GetChatlist;
import Resources.StringResources;

public class demo {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file//demo added
		
	
			int i=GetChatlist.getChatListFromLocalFile("C:\\Users\\Administrator\\.jenkins\\workspace\\Whatsapp_SendMessage//GroupNames//Device1//FM.txt").size();
			System.out.println(i);
			//
	}

}
