package com.app;

import java.util.Scanner;

public class Factors {
	static int factFind(int num) {
		
		int fact = 1;

		if(num>0)
	{
				
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}	
		
	}
		return fact;
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String fact = null;
		System.out.println("factorial of a given number " + num +" is: " +fact);
		System.out.println(factFind(sc.nextInt()));
		
	}

}

