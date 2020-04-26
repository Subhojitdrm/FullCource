package com.utils;

public class Utilities {
	//make stronger :
	//make random upper and lower case
	public void updatePassWord() {
		String passWord="Subho.123";
		String newPassWrod="";
		for(Character ch: passWord.toCharArray()) {
			if(ch.isLowerCase(ch)) {
				System.out.println(ch);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Utilities ul= new Utilities();
		ul.updatePassWord();
	}

}
