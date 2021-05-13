package com.app;

import java.util.Scanner;

public class Palindrome {
	public static boolean isPalindrome(int number) {

		int sum = 0;
		int temp = number;
		while (number > 0) {
			int r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;

		}

		return (temp==sum);
	}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number?");
		System.out.println(isPalindrome(sc.nextInt()));
		}

}
