package com.app;

import java.util.Scanner;

public class FibanociSeries {
	static void Fibanoci(int num) {
		int num1=0;
		int num2=1;
		int count = 0;
		while(count<num) {
			System.out.println(num1+ " ");			
		}
		int num3 = num1+num2;
		num1 = num2;
		num2 = num1;
		count = count + 1;		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fibanoci(0);
		
	}

}
