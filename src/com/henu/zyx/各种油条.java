package com.henu.zyx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class 各种油条 {
	public static void main(String[] args) {
		//array数组
		int[] array = new int[]{3,5,3,45,345,234,25,34,55,324,324,234,234,};
		System.out.println(array.length);
		array[0]=1;
		array[1]=2;
		array[2]=3;
		for(int i=0;i<array.length;i++){
			System.out.println("数组："+array[i]);
		}
		//定义int数组
		int[] a = {123,123};
        System.out.println("int数组："+a);
        //输出操作系统名称
        System.out.println("操作系统：:"+System.getProperties().getProperty("os.name"));
        //文件目录符号
        System.out.println("文件目录符号:"+System.getProperties().getProperty("file.separator")+System.getProperties().getProperty("file.separator"));
        //时间格式化
        Date d = new Date();
  	    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
  	    Date date=new Date(System.currentTimeMillis());
  	    System.out.println("当前时间："+date);
  	    System.out.println("时间格式化："+f.format(System.currentTimeMillis()));
  	    //数组toString()方法
  	    int[] is = new int[]{1,2,3};
  	    System.out.println("isToString"+is.toString()+":"+is.getClass());
  	    String mmm = "123,123,56";
  	    String[] st = mmm.split(",");
  	    System.out.println("分割后："+st);
  	    
	}

}
