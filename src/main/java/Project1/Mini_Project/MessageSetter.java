package Project1.Mini_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MessageSetter {

	

	public static String pickRandomMessage(String messageFolder) throws FileNotFoundException
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
	    
	    File randomfile=new File(filepath);
	    Scanner sc=new Scanner(randomfile);
	    String message="";
		    while (sc.hasNext()) 
		    {
		    	message=message+"\n"+sc.nextLine();
				
			}
			sc.close();
			return message;
}
	
}
