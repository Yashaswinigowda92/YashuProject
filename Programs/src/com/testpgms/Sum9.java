package com.testpgms;

public class Sum9 {

	public static void main(String[] args) {
		int[] arr= {1,3,6,8,5};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)  {
				if(arr[i]+arr[j]==9) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
			
		}

	}

}
