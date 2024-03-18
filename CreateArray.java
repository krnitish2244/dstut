package com.array.example;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Element of An Array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
        
		System.out.println("Below Are the Array Elements");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
	}

}
