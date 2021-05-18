package com.ojas;

import java.util.Scanner;

public class BinarySearch {
	static int[] sortElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[j];
					arr[i]=arr[j];
				}
				
				}
			}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements in array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		arr= sortElement(new int[arr.length]);
		System.out.println("after sorting elements in array:");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+ " ");
		}
		System.out.println("\n-----------");
		System.out.println("enter searching element in array");
		int search=sc.nextInt();
		int low=0, high = size-1,flag=0,mid=0;
		while(low<=high) {
			mid = (low + high)/2;
			if(arr[mid]==search) {
				flag = 1;
				break;
				
			}
			else if(arr[mid] == search) {
				flag = 1;
				break;
			}
			else if(arr[mid]<search) {
				low=mid + 1;
			}
			else if(arr[mid]>search) {
				high = mid -1;
			}
		}
		if(flag==1) {
			System.out.println(search + "element is found at" +mid);
		}
			else 
				System.out.println(search + "element is not found");
		}
	
	
			}
		
		

	


