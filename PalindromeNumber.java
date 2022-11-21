//121<------->121
package com.bl.javapracticeproblems;
public class PalindromeNumber {
	public static void main(String[] args) {
		int c,s=0,r;
		int n=121;
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
		System.out.println("Palindrome Number");
		else
		System.out.println("Not a Palindrome Number");
	}
}
