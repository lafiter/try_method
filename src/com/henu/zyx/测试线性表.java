package com.henu.zyx;

import com.henu.zyx.线性表.SequenceList;

public class 测试线性表 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			SequenceList<String> list = new SequenceList<String>();
			list.add("擦擦擦擦擦擦");
			list.add("发的发的发的");
	        list.add("哦哦哦哦发的");
	     list.insert("oo", 6);
	     System.out.println(list);
	}

}
