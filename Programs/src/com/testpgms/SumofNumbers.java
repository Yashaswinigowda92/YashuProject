package com.testpgms;

public class SumofNumbers {

	public static void main(String[] args) {
		String s="play365games24*7";
		int num=0;
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int dig=s.charAt(i)-48;
				num=num*10+dig;
			}
			else {
				sum=sum+num;
			num=0;
			}
				
		}
		sum=sum+num;
		System.out.println(sum);

	}

}
