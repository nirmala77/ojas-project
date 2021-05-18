package com.nimmu;

import java.util.Scanner;

public class Rounder {
	static int calculate(int num) {
		int result=0;
		if(num < 0 || num == 0) {
			result = -1;
		}
		else {
			if(num % 2 ==  0) {
				result = num * num;
			}
			else if(num % 2 == 1) {
				result = num * num * num;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number?");
		System.out.println(calculate(sc.nextInt()));
		
		
	}

}
