package PaChong;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class WebPageSource {
    public static void main(String args[]){    
        URL url;
        int responsecode;
        HttpURLConnection urlConnection;
        BufferedReader reader;
        String line;
        try{
            //����һ��URL����Ҫ��ȡԴ�������ҳ��ַΪ��http://www.sina.com.cn
            url=new URL("http://www.0xroot.cn/demo.html");
            //��URL
            urlConnection = (HttpURLConnection)url.openConnection();
            //��ȡ��������Ӧ����
            responsecode=urlConnection.getResponseCode();
            if(responsecode==200){
                //�õ������������������ҳ������ 
                reader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"utf-8"));
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            }
            else{
                System.out.println("��ȡ������ҳ��Դ�룬��������Ӧ����Ϊ��"+responsecode);
            }
        }
        catch(Exception e){
            System.out.println("��ȡ������ҳ��Դ��,�����쳣��"+e);
        }
    }
}