package com.incredigrimm.projecteuler;


/*
The following iterative sequence is defined for the set of positive integers:

n - n/2 (n is even)
n - 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 - 40 - 20 - 10 - 5 - 16 - 8 - 4 - 2 - 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class Problem14 {
	private static boolean debug = false;
	public static void main(String[] args) {
		Problem14 myCollatz = new Problem14();
		if(!debug){
			myCollatz.findLongestChain();
		} else {
			myCollatz.test();			
		}
	}
	
	private void findLongestChain(){
		int biggest = 0;
		int realNum = 0;
		for (int i = 2; i <= 1000000; i++){
			long collatz = i;
			int chain = 1;
			while (collatz > 1){
				if(collatz%2==0){
					collatz = handleEven(collatz);
				} else {
					collatz = handleOdd(collatz);
				}
				chain++;
			}
			if(biggest <= chain){
				biggest = chain;
				realNum = i;
			}
		}
		System.out.println("Number with longest Collatz chain is: " + realNum);
	}
	
	private long handleEven(long number){
		return number/2;
	}
	private long handleOdd(long number){
		return (number*3)+1;
	}
	
	private void test(){
		long collatz = 837799;
		int chain = 1;
		String strChain = new String();
		while (collatz > 1){
			System.out.println("Chain: " + chain + " collatz: " + collatz);
			if(collatz%2==0){
				collatz = handleEven(collatz);
				strChain = strChain + " - " + String.valueOf(collatz);
			} else {
				collatz = handleOdd(collatz);
				strChain = strChain + " - " + String.valueOf(collatz);
			}
			chain++;
		}
		System.out.println(strChain);
		System.out.println("Chain: " + chain + " collatz: " + collatz);
	}

}
