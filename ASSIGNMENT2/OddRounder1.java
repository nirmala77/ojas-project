package com.app;

class OddRounder {
	void odd(String a )
	{
		int num=Integer.parseInt(a);
		try {
				if(num%2==0)
					System.out.println("even number");	
				else {
			
			int a1=num/10;
			int mul=(a1+1)*10;
			System.out.println(mul);
		
				}		
		}
			catch(Exception e) {
				System.out.println("error");
			}

		}

	}
public class OddRounder1{
	public static void main(String[] args) {
		OddRounder od=new OddRounder();
		od.odd(args[0]);
	}



}
