package com.array.example;

import java.util.Scanner;

public class SearchArrayElement {
	
	public static void binarySearch(int arr[], int x) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		int count = 0;
		while(high>low) {
			 mid = (high+low)/2;
			 
			 if(arr[mid]==x) {
				 count++;
				 System.out.println("Element is found at Position at "+(mid+1));
				 break;
			 }else if(arr[mid]>x) {
				 high = mid-1;
			 }else {
				 low=mid+1;
			 }
		}
		
		if(count == 0) {
			System.out.println("Element Not found");
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[] {2,5,4,9,6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element to Search");
		int k = sc.nextInt();
		
		// Linear Search
		
//		int count = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==k) {
//				count++;
//			System.out.println("Position of element is "+(i+1));
//			}
//		}
//		
//		if(count == 0) {
//			System.out.println("Element is not found");
//		}
		
		//Binary Search
		
		binarySearch(arr,k);
		
	}

}
