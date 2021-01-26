package com.testpgms;

public class PrintonlyabcInString {

	public static void main(String[] args) {
		String s="123abcjri678ABC";
		String str="abc";
		for(int i=1;i<s.length()-1;i++)
		{
		
		String  res = s.charAt(i-1)+""+s.charAt(i)+s.charAt(i+1);
		
		if(res.equals(str)) {
			System.out.println(res);
		}
			
		}
		
		}
	}


