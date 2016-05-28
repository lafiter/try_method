package com.henu.zyx;

import java.util.Iterator;

import com.alibaba.fastjson.JSONObject;

public class 测试json {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
        String str = "{'value':'aa1','count':10,'value':'aa2','count':15,'value':'aa3','count':20," +  
                "'value':'ab','count':110,'value':'ab2','count':'115','value':'ab3','count':'210'}";  
        String str1 = "['value':'aa1','count':10,'value':'aa2','count':15,'value':'aa3','count':20," +  
                "'value':'ab','count':110,'value':'ab2','count':'115','value':'ab3','count':'210']";  
        JSONObject jsonObject = JSONObject.parseObject(str);
//        for(java.util.Map.Entry<String,Object> entry:jsonObject.entrySet()){  
//            System.out.println(entry.getKey()+"-"+entry.getValue()+"\t");  
//        }  
        String[] s= {"语文","数学","英语","物理","化学","历史","政治","总分"};
//        JSONArray ja = JSONArray.parseArray(str1);
//        JSONArray noArr = (JSONArray)JSON.parse(jsonObject.get("count").toString());  
//        for(Object no : noArr) {  
//            System.out.println(no.toString());  
//        }  
        String[] s1 = {"ss8","sc8","sg8","ss9","sc9","sg9","ss10","sc10","sg10","ss11","sc11","sg11","ss12","sc12","sg12","ss13","sc13","sg13","ss14","sc14","sg14","sst","sct","sgt"};
        System.out.println(s.length);
        int m=3;
        String mt = null;
        for(int i=0;i<s.length;i++){
        	System.out.print(s[i]);
        	System.out.print(s1[i*m]);
        	System.out.print(s1[i*m+1]);
        	System.out.print(s1[i*m+2]);
        	mt+=s[i]+s1[i*m]+s1[i*m+1]+s1[i*m+2];
        }
        System.out.println(mt);
    }  

}
