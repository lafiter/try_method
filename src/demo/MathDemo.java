package demo;

public class MathDemo {

	 
	public static void main(String[] args) {
		 //����һ��double����
		 double a = 12.81;
		 //ǿ��ת��int
		 int b = (int) a;
		 System.out.println("ǿ������ת����"+b);
         //��������
		 long c = Math.round(a);
         System.out.println("�������룺"+c);
         //����С�ڲ������������
         double d = Math.floor(a);
         //���ش��ڲ�������С����
         double e = Math.ceil(a);
         //����[0��1)֮��������������
         double x = Math.random();
         System.out.println("�������"+x);
         //����[0,99)֮����������
         int y = (int)(Math.random() *99);
         System.out.println(y);
         
	}

}
