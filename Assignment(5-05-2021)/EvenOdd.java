package com.nimmu;

import java.util.Scanner;

public class EvenOdd {
	static String isEvenorOdd(int num) {
		String result=" ";
		if(num < 0 || num == 0) {
			result ="invalid";
		}
		else {
		if(num % 2 == 0)	{
			result = "even";
		}
		else if(num % 2 == 0) {
			result = "odd";
		}
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number?");
		System.out.println(isEvenorOdd(sc.nextInt()));
		
		
	}

}
