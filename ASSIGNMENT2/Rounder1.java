package com.app;

	 class Rounder {
		static void check(String str) {
		try {
		int n = Integer.parseInt(str);
		if (n % 2 == 0) {
		int a = n / 10;
		int even = (a + 1) * 10;
		System.out.println(even);
		} else {
		System.out.println(n);
		}

		} catch (Exception e) {
		System.out.println("Error");
		}
		}
		}

	public class Rounder1 {
		public static void main(String[] args) {
		Rounder.check(args[0]);

		}

		}
