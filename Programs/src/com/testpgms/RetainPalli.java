package com.testpgms;

public class RetainPalli {

	public static void main(String[] args) {
		String s="aba bil lil";
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			String rev="";
			
			for(int j=0;j<str[i].length();j++) {
				rev=str[i].charAt(j)+rev;
			}
			//System.out.println(rev);
			if(str[i].equals(rev)) {
				System.out.println(str[i]);
			}
			
			
		}

	}

}
