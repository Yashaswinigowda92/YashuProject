package com.testpgms;

public class ShiftArrayElements {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int key=2;
		//Displays original array
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
		//rotate the given array by n times towards left
		for(int i=0;i<key;i++) {
			int j;
			int first=arr[0];
			
			for( j=0;j<arr.length-1;j++) {
			//shift the elements one by one
				arr[j]=arr[j+1];
				
				
			}
			 //first element of given array is added at end
			arr[j]=first;
		}
		System.out.println();
		//to print elements after rotation
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}

}
}
