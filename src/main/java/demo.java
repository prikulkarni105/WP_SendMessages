import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		//This method returns list of string from local file

		File localfile=new File(System.getProperty("user.dir")+"/GroupNames/Device1/FM.txt");
		Scanner sc=new Scanner(localfile);
		ArrayList<String> chatlist=new ArrayList<String>();
			while (sc.hasNext()) 
			{
				chatlist.add(sc.nextLine());
			}
		
			System.out.println(chatlist.size());
	
	}

}
