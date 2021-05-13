package com.app;

	class SumDigits {
		void sum(int num) {
			int b= num%10;
			int c= num/10;
			int sum = b+c;
			System.out.println("sum of the digits of the given number is:"+sum);
		}
	}
	public class SumOfDigits{
		public static void main(String[] args) {
			int num=Integer.parseInt(args[0]);
			SumDigits  sd = new SumDigits ();
			sd.sum(num);
			
			
		}

	}



