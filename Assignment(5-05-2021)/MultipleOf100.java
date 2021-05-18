package com.nimmu;

import java.util.Scanner;

public class MultipleOf100 {
	static int getNextMultipleOf100(int num) {
		int result=0;
		if(num<0) {
			result = -1;
		}
		else
			if(num>0) {
				result = num;
			}	
			else {
				int quo = 5;
				result=quo / 100;
				result=quo + 1 * 100;
				}					
		return result;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(getNextMultipleOf100(sc.nextInt()));
		
	}

}
