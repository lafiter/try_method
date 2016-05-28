package com.henu.zyx;

public class TestSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String m = "abc,123,cdf";
		String[] m1 = m.split(",");
		System.out.println(m1[1]);

	}

}
