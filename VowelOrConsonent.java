package com.bl.javapracticeproblems;
import java.util.Scanner;
public class VowelOrConsonent {
     public static void main(String[] args) {
		char ch;
		System.out.println("Enter any Character");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);
		
		if(ch=='a' || ch=='A' ||ch=='e' || ch=='E'|| ch=='I'|| ch=='i'|| ch=='O'|| ch =='o'|| ch=='U'|| ch=='u')
		{
			System.out.println("Vowel");
		}	
		else
		{
			System.out.println("Consonent");
		}
	}
}
