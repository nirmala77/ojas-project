package com.app;


	 class Multiple {
		 public void mul(int num) {
			 int b=num/100;
			 int multiple=(b+1)*100;
			 System.out.println("next multiple of 100 of given "+num+ "is" +multiple);
				
		 }
	 }
		
		public class Multiple1 {
			public static void main(String[] args) {
				int num=Integer.parseInt(args[0]);
				Multiple m=new Multiple();
				m.mul(num);			
						
			}

		}



