import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import Resources.StringResources;

public class demo {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file

		URL fileurl = new URL(StringResources.Device1FMGroups);

		File localfile=new File(fileurl.getFile());
		Scanner sc=new Scanner(localfile);
		ArrayList<String> chatlist=new ArrayList<String>();
			while (sc.hasNext()) 
			{
				chatlist.add(sc.nextLine());
			}
		
			
		
			System.out.println(chatlist.size());
	
	}

}
