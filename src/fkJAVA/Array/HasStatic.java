package fkJAVA.Array;

public class HasStatic {
   private static int x = 100;
   private static final String MESSAGE="taobao";
   public static void main(String args[]){
	   HasStatic hsl = new HasStatic();
	   hsl.x++;
	   HasStatic hs2 = new HasStatic();
	   hs2.x++;
	   hsl = new HasStatic();
	   hsl.x++;
	   HasStatic.x--;
	   System.out.println("x="+x);
	   short a=128;
	   byte b = (byte)a;
	   System.out.println(b);
	   //final int i =0;
	   int j  ;
	    
	   //System.out.println(i=i++);
	   int sum=0;
	   int i;
	   for(i=0;i<10;++i,sum+=i); 
	   System.out.println(i);
	   String c ="tao"+"bao";
	   String d = "tao";
	   String e = "bao";
	   String f = d+e;
	   System.out.println(c.equals(d+e));
	   System.out.println(c==MESSAGE);
	   System.out.println((d+e)==MESSAGE);
	   System.out.println(f==MESSAGE);
	   String s = "zhaoyangxun";
	   int t = s.indexOf("s");
	   System.out.println("t��ֵ��"+t);
	   int k = 10;
	   int l = 11;
	    byte[] aa = "aa".getBytes();
	   System.out.println("aa���ȣ�"+aa.length);
	   
	   int m=1000;
	   int n=1000;
	   System.out.println(m==n);
       System.out.println();
       Integer x=1000;
       Integer z=1000;
       System.out.println(x==z);
       System.out.println(x.equals(z));
   }
   public int ��ƿ����(int s){
	   //��һ��ͳ��ʣ�µ���
	   int ������ƿ = s/2;
	   int ����ƿ�� = s/2;
	   int ������ƿ = s/2;
	   return 1;
   }
   
}
