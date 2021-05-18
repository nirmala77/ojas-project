package com.nimmu;

import java.util.Scanner;

public class Even {
	static int isEven(int num) {
		int result=0;
		if(num < 0 || num == 0) {
			result = -1;
		 }
		else {
				if(num % 2 == 0) {
					result = 1;	
			     }
				else {
					result = 0;	
				}
		}
		 return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number?");
		System.out.println(isEven(sc.nextInt()));
		
	}

}
