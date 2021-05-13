package com.app;

 class EvenOdd {
	
		static void EvenOdd(String str) {

		try {
		int n = Integer.parseInt(str);
		if (n % 2 == 0) {
		System.out.println("Even Number");
		} else {
		System.out.println("Odd Number");
		}

		} catch (Exception e) {
		System.out.println("Error");
		}

		}
		}


public class EvenOdd1 {
	public static void main(String[] args) {
	EvenOdd.EvenOdd(args[0]);
	}

	}

