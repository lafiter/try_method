package com.henu.zyx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
public class 从接口拿数据{
	public static void main(String[] args) {
//		String url = "http://192.168.1.114:8080/btlh_wx/releaseScoreController.do?relStuScore&data=";
//		   System.out.println("URL："+url);
//	       StringBuffer json = new StringBuffer();
//	        try {
//	        	//实例一个url和URLConnection
//	        	String message = java.net.URLEncoder.encode("utf-8");
//	        	url+="";
//	            URL oracle = new URL(url);
//	            //打开链接
//	            URLConnection yc = oracle.openConnection();
//	            //输入流作参数传进InputStreamReader并用BufferedReader接受
//	            BufferedReader in = new BufferedReader(new InputStreamReader(
//	                                        yc.getInputStream()));
//	            String inputLine = null;
//	            //一直读到空，并设置流编码是UTF8
//	            while ( (inputLine = in.readLine()) != null) {
//	                json.append(new String(inputLine.getBytes(),"UTF-8"));
//	            }
//	            //记得关闭连接
//	            in.close();
//	        } catch (Exception e)  {
//	        	e.printStackTrace();
//	        }
//		try {
//	        JSONArray jn =  JSONArray.fromObject(json.toString());
//			if(jn.size()>0){
//			for (int i = 0; i < jn.size(); i++) {
//				JSONObject jo = (JSONObject) jn.get(i);
//				System.out.println(jo.get("id"));
//				System.out.println(jo.get("fdName"));
//			}
//			System.out.println(jn);
//			}
//			System.out.println("数据大小："+jn.size());
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("连接超时！");
//		}
		//发送 POST 请求
		List<JSONObject> ljb = new ArrayList<JSONObject>();
		JSONObject obj = new JSONObject();
		obj.element("name", "李宇航");
        obj.element("num", "910115");
        obj.element("value", "\"ss8\":\"95.0\",\"sc8\":\"9\",\"sg8\":\"103\",\"ss9\":\"97.0\",\"sc9\":\"2\",\"sg9\":\"46\",\"ss10\":\"96.0\",\"sc10\":\"5\",\"sg10\":\"81\",\"ss11\":\"60.0\",\"sc11\":\"3\",\"sg11\":\"84\",\"ss12\":\"36.0\",\"sc12\":\"8\",\"sg12\":\"84\",\"ss13\":\"43.0\",\"sc13\":\"3\",\"sg13\":\"32\",\"ss14\":\"58.0\",\"sc14\":\"1\",\"sg14\":\"16\",\"sst\":\"485.0\",\"sct\":\"2\",\"sgt\":\"53\"");
        ljb.add(obj);
        String s= "语文,数学,英语,物理,化学,历史,政治,总分";
        String sm = "ss8,sc8,sg8,ss9,sc9,sg9,ss10,sc10,sg10,ss11,sc11,sg11,ss12,sc12,sg12,ss13,sc13,sg13,ss14,sc14,sg14,sst,sct,sgt";
        String msg = null;
        String ljb1 = null;
        try {
            s=java.net.URLEncoder.encode(s, "utf-8");
        	ljb1 = java.net.URLEncoder.encode(ljb.toString(), "utf-8");
			msg = java.net.URLEncoder.encode("2015年9年级上学期期中考试", "utf-8");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String sr=Postpl.sendPost("http://192.168.1.114:8080/btlh_wx/releaseScoreController.do?relStuScore", "&data="+ljb1+"&title="+s+"&field="+sm+"&examname="+msg);
        System.out.println(sr);
	}

}