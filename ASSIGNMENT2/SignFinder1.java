package com.app;
 class SignFinder {
		 static void find(String str) {
		 try {
		 int n = Integer.parseInt(str);
		 if (n == 0) {
		 System.out.println("Zero");
		 } else if (n > 0) {
		 System.out.println("Positive Value");
		 } else {
		 System.out.println("Negative Value");
		 }

		 } catch (Exception e) {
		 {
		 System.out.println("Error");
		 }
		 }
		 }

		 }
 public class SignFinder1 {
	 public static void main(String[] args) {
	 SignFinder.find(args[0]);

	 }

	 }


