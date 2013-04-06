package com.incredigrimm.projecteuler;


/*
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */

public class Problem4 {
	public static void main(String[] args) {
		Problem4 myPalindromic = new Problem4();
		System.out.println("Correct Answer: 906609");
		myPalindromic.variante2();
	}
	
	private boolean isPalindromic(int num){
		boolean debug = false;
		String strNum = String.valueOf(num);
		int digits = strNum.length();
		if (debug)
			System.out.println(num);
		for (int i = 0; i < 3; i++) {
			if (!strNum.substring(i, i+1).equals(strNum.substring(digits-(i+1),digits-i))){
				if (debug)
					System.out.println("First and last no match: "+strNum.substring(i, i+1)+" - "+ strNum.substring(digits-(i+1),digits-i));
				return false;
			}
		}
		return true;
	}
	
	private void variante2(){
		int biggest = 0;
		for (int i = 999; i >= 100; i--){
			for (int j = i; j>=100; j--){
				int pali = i*j;
				if(isPalindromic(pali)){
					if(pali > biggest){
						biggest = pali;
					}
				}
			}
		}
		System.out.println(biggest);
	}

}
