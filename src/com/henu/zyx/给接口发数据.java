package com.henu.zyx;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

public class 给接口发数据 {
    public static final String ADD_URL = "http://192.168.1.114:8080/btlh_wx/releaseScoreController.do?relStuScore";
    public static void appadd() {
    	List<JSONObject> ljb = new ArrayList<JSONObject>();
        try {
            URL url = new URL(ADD_URL);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("connection", "Keep-Alive");
            //connection.setRequestProperty("Content-Type", "text/plain; charset=utf-8");
            connection.connect();
            //POST请求
            DataOutputStream out = new DataOutputStream(
                    connection.getOutputStream());
            JSONObject obj = new JSONObject();
            JSONObject obj1 = new JSONObject();
            //String message = java.net.URLEncoder.encode("哈哈哈","utf-8");
            obj.element("name", "李宇航");
            obj.element("num", "910115");
            obj.element("value", "\"ss8\":\"95.0\",\"sc8\":\"9\",\"sg8\":\"103\",\"ss9\":\"97.0\",\"sc9\":\"2\",\"sg9\":\"46\",\"ss10\":\"96.0\",\"sc10\":\"5\",\"sg10\":\"81\",\"ss11\":\"60.0\",\"sc11\":\"3\",\"sg11\":\"84\",\"ss12\":\"36.0\",\"sc12\":\"8\",\"sg12\":\"84\",\"ss13\":\"43.0\",\"sc13\":\"3\",\"sg13\":\"32\",\"ss14\":\"58.0\",\"sc14\":\"1\",\"sg14\":\"16\",\"sst\":\"485.0\",\"sct\":\"2\",\"sgt\":\"53\"");
            ljb.add(obj);
             
            String[] s= {"语文","数学","英语","物理","化学","历史","政治","总分"};
            String sm = "ss8,sc8,sg8,ss9,sc9,sg9,ss10,sc10,sg10,ss11,sc11,sg11,ss12,sc12,sg12,ss13,sc13,sg13,ss14,sc14,sg14,sst,sct,sgt";
            System.out.println("大小是："+ljb.size());
            @SuppressWarnings("deprecation")
			String en = java.net.URLEncoder.encode("data="+ljb+"&title="+s+"&field="+sm+"&examname="+"2015年9年级上学期期中考试");
            out.writeBytes(en);
            //System.out.println("data="+obj.toString());
            out.flush();
            out.close();
            //读取响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            System.out.println(sb);
            reader.close();
            connection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        appadd();
    }

}
