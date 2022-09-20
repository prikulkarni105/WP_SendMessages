import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import Project1.Mini_Project.GetChatlist;
import Project1.Mini_Project.MessageSetter;
import Resources.StringResources;

public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file//demo added
		
	String message=MessageSetter.pickRandomMessage(StringResources.MessagesFolder);
		System.out.println(message);	
			//
	}

}
