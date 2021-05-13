package com.app;

class ThreeDPalindrome {
static boolean palindrom(String str) {

int n = str.length();

String x = "";
x = x + str.charAt(n - 1) + str.charAt(n - 2) + str.charAt(n - 3);

return str.equals(x);

}
}

public class ThreeDPalindrome1 {

public static void main(String[] args) {

boolean result =ThreeDPalindrome.palindrom(args[0]);
System.out.println(result);
}

}

	
	 

		



