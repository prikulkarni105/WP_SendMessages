package Project1.Mini_Project;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkManager {

		
	public static boolean netIsAvailable() 
		 		{
				    try {
				        final URL url = new URL("http://www.google.com");
				        final URLConnection conn = url.openConnection();
				        conn.connect();
				        conn.getInputStream().close();
				        return true;
				        
				    } catch (MalformedURLException e) {
				        throw new RuntimeException(e);
				    } catch (IOException e) {
				        return false;
				    }
		 		}
		 
		
	}


