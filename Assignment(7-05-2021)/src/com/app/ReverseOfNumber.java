package com.app;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void reversenum(int num) {
		int num1 = 123,reverse = 0;
		while(num != 0) {
			int rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num /10;
		}			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("reverse of a given number is:" + " ");
		System.out.println(sc.nextInt());

	}

}



















































































































































































































































































































































































































































































































