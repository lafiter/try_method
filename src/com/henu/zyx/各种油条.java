package com.henu.zyx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class �������� {
	public static void main(String[] args) {
		//array����
		int[] array = new int[]{3,5,3,45,345,234,25,34,55,324,324,234,234,};
		System.out.println(array.length);
		array[0]=1;
		array[1]=2;
		array[2]=3;
		for(int i=0;i<array.length;i++){
			System.out.println("���飺"+array[i]);
		}
		//����int����
		int[] a = {123,123};
        System.out.println("int���飺"+a);
        //�������ϵͳ����
        System.out.println("����ϵͳ��:"+System.getProperties().getProperty("os.name"));
        //�ļ�Ŀ¼����
        System.out.println("�ļ�Ŀ¼����:"+System.getProperties().getProperty("file.separator")+System.getProperties().getProperty("file.separator"));
        //ʱ���ʽ��
        Date d = new Date();
  	    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
  	    Date date=new Date(System.currentTimeMillis());
  	    System.out.println("��ǰʱ�䣺"+date);
  	    System.out.println("ʱ���ʽ����"+f.format(System.currentTimeMillis()));
  	    //����toString()����
  	    int[] is = new int[]{1,2,3};
  	    System.out.println("isToString"+is.toString()+":"+is.getClass());
  	    String mmm = "123,123,56";
  	    String[] st = mmm.split(",");
  	    System.out.println("�ָ��"+st);
  	    
	}

}
