package ImageEdit;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class GetUrlSource {
	//'http://117.158.158.81:85/api/RFIDRecord/0050333072/20151013'
	 public static void main(String args[]){
		 URL url = null;
		 InputStream is = null;
		 try{
			 //url = new URL("http://117.158.158.81:85/api/RFIDRecord/0050333072/20151013");
			 url = new URL("http://192.168.1.7:8080/btlh_moral/interf/eduTypeList");
			 is = url.openStream();
			 BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			 String line;
			 while((line=br.readLine())!=null){
				 System.out.println(line);
			 }
		 }catch(Exception ex)
		 {ex.printStackTrace();}
		 finally{
			  try{
				  if(is!=null){
//					  is.close();
				  }
			  }catch(Exception ex){
				  ex.printStackTrace();
			  }
		 }
	 }
}
