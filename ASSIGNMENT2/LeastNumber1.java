package com.app;
class LeastNumber {
	void check(String a,String b) {
		try {
			String[] args;
			int a1=Integer.parseInt(a);
			int b1=Integer.parseInt(b);
			if(a1<b1)
				System.out.println(a1);
			else
				System.out.println(b1);
		
	}	
		catch(Exception e) {
			System.out.println("error");
		}
	}
}
public class LeastNumber1{
	
	public static void main(String[] args) {
		LeastNumber gn=new LeastNumber();		
		gn.check(args[0], args[1]);
		
	}
}



