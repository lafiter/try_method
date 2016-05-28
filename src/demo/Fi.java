package demo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer a = 1000, b = 1000;  
	    System.out.println(a == b);//1
	    Integer c = 100, d = 100;  
	    System.out.println(c == d);//2
	    List l = new ArrayList();
	    l.add("aa");
	    l.add("bb");
	    l.add("cc");
	    for (Iterator iter = l.iterator(); iter.hasNext();) {
	     String str = (String)iter.next();
	     System.out.println(iter.hasNext());
	     System.out.println(str);
	    }
	    /*迭代器用于while循环*/
	    Iterator iter = l.iterator();
	    while(iter.hasNext()){
	     String str = (String) iter.next();
	     System.out.println(str);
	    }
	}

}
