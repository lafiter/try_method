package com.henu.zyx;

import java.util.Arrays;
import java.util.List;

public class 测试数组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		String str = "语文,数学,英语,物理,化学,历史,政治,总分";
		String[] a = str.split(",");  
		for(String m:a){
			System.out.println("处理结果: "+m);
		}
		 
        
	}

}
