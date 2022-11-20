package com.bl.javapracticeproblems;
public class SumOfNaturalNumber {
	public static void main(String[] args) {
        int n = 5, sum = 0, i = 1;
 
        /* While loop*/
 
        // Test condition
        while (i <= n) {
 
            sum = sum + i;   
            i++;
        }
 
        // Print the sum
        System.out.println(
            "Sum of natural numbers using while loop is:"
            + " " + sum);			
	}

}