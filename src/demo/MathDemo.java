package demo;

public class MathDemo {

	 
	public static void main(String[] args) {
		 //定义一个double类型
		 double a = 12.81;
		 //强制转换int
		 int b = (int) a;
		 System.out.println("强制类型转换："+b);
         //四舍五入
		 long c = Math.round(a);
         System.out.println("四舍五入："+c);
         //返回小于参数的最大整数
         double d = Math.floor(a);
         //返回大于参数的最小整数
         double e = Math.ceil(a);
         //产生[0，1)之间的随机数浮点数
         double x = Math.random();
         System.out.println("随机数："+x);
         //产生[0,99)之间的随机整数
         int y = (int)(Math.random() *99);
         System.out.println(y);
         
	}

}
