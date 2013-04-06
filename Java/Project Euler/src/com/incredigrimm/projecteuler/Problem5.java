package com.incredigrimm.projecteuler;

/*
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem5 myProblem5 = new Problem5();
		myProblem5.findNumber();
	}

	private void findNumber(){
		boolean debug = false;
		boolean notfound = true;
		boolean dividable = true;
		long theNum = 0;
		for (long i = 2; i < 1000000000 && notfound; i++) {
			dividable = true;
			if (debug)
				System.out.println("i: "+ i);
			for (int j = 20; j>=2 && dividable;j--){
				if(debug)
					System.out.println("j: " + j);
				if (!isDividable(i, j))
					dividable = false;
			}
			if (dividable){
				notfound = false;
				theNum = i;
			}
		}
		System.out.println(theNum);
	}
	
	private boolean isDividable(long num, int divisor){
		if (num % divisor == 0)
			return true;
		else
			return false;
				
	}
	
}
