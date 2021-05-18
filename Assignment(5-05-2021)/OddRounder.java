package com.nimmu;

import java.util.Scanner;

public class OddRounder {
	static int oddRounder(int num) {
		int result=0;	
		if(num < 0 ) {
					result = -1;
				 }
				else {
					if(num == 0) {
					result = -2;
					}
					else if(num % 2 == 1) {
						result =num ;	
						}
						else {
						int quo = 0;
						result=quo / 10;
						result=quo + 1 * 10;
						}
						result = 0;	
						}
				 return result;
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter any number?");
				System.out.println((sc.nextInt()));
				
			}

		}
