package ImageEdit;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetSources {
    public static void main(String args[]){
    	
     String url = "http://117.158.158.81:85/api/RFIDRecord/0050333072/20151013";
     try {
        	URL urlGet = new URL(url);
       	    HttpURLConnection http = (HttpURLConnection)urlGet.openConnection();
		    http.setRequestMethod("GET");
		    http.setDoOutput(true);
		    http.setDoInput(true);
		    System.setProperty("sun.net.client.defaultConnectTimeout","30000");
		    System.setProperty("sun.net.client.defaultReadTimeout","30000");
		    http.connect();
		    InputStream is = http.getInputStream();
		    int size = is.available();
		    byte[] jsonBytes = new byte[size];
		    is.read(jsonBytes);
		    String message = new String(jsonBytes,"UTF-8");
		    System.out.println(message);
            is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}  
}
