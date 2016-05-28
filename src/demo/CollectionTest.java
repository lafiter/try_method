package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void testSort1(){
		List<Integer> li = new ArrayList<Integer>();
	    for(int i=0;i<10;i++){
	    	li.add(new Random().nextInt(100));
	    	System.out.println("成功添加整数"+new Random().nextInt(100));
	    }
	    //System.out.println(li.get(8));
	    Collections.sort(li);
	    for(int s:li){
	    	System.out.println(s);
	    }
	}
	public static void main(String[] args) {
		testSort1();
  
	}

}
