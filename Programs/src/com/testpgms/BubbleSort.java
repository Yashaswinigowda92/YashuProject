package com.testpgms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {90,10,20,30,40};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)	{
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//largest of the given array
		
		/*System.out.println(arr[0]);*/
		
		//sum of 3 numbers
		
		/*int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(sum);*/
		
		//to print the elements in descending order
		
				//for(int i=0;i<arr.length;i++) {
					//System.out.println(arr[i]);
				}
			}
		