package com.utils;

public class practices {
	public static String ree;
	public static String test01() {
		ree="test this";
		System.out.println("testew");
		return ree;
	}
	public void test02() {
		System.out.println(test01());
	}
	
	
	
	
	

	public static void main(String[] args) {
		practices re=new practices();
		re.test02();
		System.out.println("this is final "+practices.ree);

	}

}
