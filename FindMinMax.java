package com.bl.javapracticeproblems;

import java.util.Scanner;

public class FindMinMax {
	public static void main(String[] args) {
		int a,b,c=1;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter 1st number");
		a=r.nextInt();
		System.out.println("Enter 2st number");
		b=r.nextInt();
	   int s= a+b*c;
	   int p= c+a/b;
	   int t= a%b+c;
	   int q= a*b+c;
		
      System.out.println("First operation "+ s);
      System.out.println("Secount operation "+ p);
      System.out.println("Third operation "+ t);
      System.out.println("Forth operation "+ q);

	}
}
