package com.ojas;
import java.util.Scanner;
public class EvenOfTen {	
		static String even(int[] values) {
			String result=" ";
			for(int i=0;i<values.length;i++) {
				if(values[i] % 2 == 0) {      
					int even=values[i];
					result += even+ " ";
				}
			}
			return result;
		}
		public static void main(String[] args) {
				
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the ten numbers:");
			int[] value=new int[10];
			for( int i=0;i<value.length;i++) {
			value[i]=sc.nextInt();
			}																																																																		
			System.out.println("\nthe even numbers are:" +even(value));
		}
	}

