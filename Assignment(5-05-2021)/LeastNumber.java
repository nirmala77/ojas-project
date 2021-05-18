package com.nimmu;

import java.util.Scanner;

public class LeastNumber{
	
	static int getLeast(int firstNum, int secondNum) {
		
			int result = 0;		
			if(firstNum < 0 || secondNum < 0) {
				result = -1;
			}
			else if(firstNum == 0 || secondNum == 0){
				result = -2;
			}
			else {
				if(firstNum >= secondNum) {
					result = secondNum;
				}
				else
					result = firstNum;
			}
			return result;			
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers:");
		System.out.println(getLeast(sc.nextInt(), sc.nextInt()));
		
	}


}
