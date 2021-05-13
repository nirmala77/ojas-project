package com.app;
class DigitCheck{
	void check(int num) {
		int fno=num/10;
		int sno=num%10;
		int checker=fno-sno;
		System.out.println(checker);
		
	}
}

public class DigitChecker {
	
		public static void main(String[] args) {
			int num=Integer.parseInt(args[0]);
			DigitCheck dc=new DigitCheck();
			dc.check(num);		

	}

}
