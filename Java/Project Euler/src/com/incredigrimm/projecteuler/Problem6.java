package com.incredigrimm.projecteuler;




/*


The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

*/


public class Problem6 {

	public static void main(String[] args) {
		Problem6 mySums = new Problem6();
		mySums.printDifference();
	}
	
	private void printDifference(){
		long natMax = 100;
		long sumOS = sumOfSquares(natMax);
		long sqrOS = squareOfSum(natMax);
		System.out.println("Sum of Squares: " + sumOS);
		System.out.println("Square of Sums: " + sqrOS);
		System.out.println("Difference: " + (sqrOS-sumOS));
	}
	
	private long sumOfSquares(long natMax){
		long sum = 0;
		for (long i = 1; i <= natMax; i++){
			sum = sum + (i*i);
		}
		return sum;
	}
	
	private long squareOfSum(long natMax){
		long sum = 0;
		for (long i = 1; i <= natMax; i++){
			sum = sum + i;
		}
		return sum*sum;
	}

}
