package random;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class DataScraping {

	public static void main(String[] args) throws IOException {
		
		
		 URL url=new URL("https://stackoverflow.com/questions/6159118/using-java-to-pull-data-from-a-webpage");
		 URLConnection urlConnp=url.openConnection();
		 InputStream is=urlConnp.getInputStream();
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(is));
		 String line = null;
		 int count=0;
		 while((line= br.readLine())!=null)
		 {
			 
			 if(line.contains("stack"))
			 {
				 
				 count++;
			 }
			 
		 }
		 System.out.println(count);
		 

	}

}
