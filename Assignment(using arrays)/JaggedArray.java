package com.ojas;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] stud=new  int[3][0];
		stud[0]=new int[3];
		stud[1]=new int[2];
		stud[2]=new int[1];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 studs marks");
		for(int i=0;i<stud.length;i++) {
			System.out.println("enter " +(i+1) +"stud" +stud[i].length+"sub marks");		
			for(int j=0;j<stud[i].length;j++) {
				stud[i][j]=sc.nextInt();
			}		
		}
		System.out.println("students info");
		for(int i=0;i<stud.length;i++) {
			for(int j = 0;j<stud[i].length;j++) {
				System.out.println(stud[i][j]+" ");
				
			}
			System.out.println();
		}
	}	
		
		

	}


