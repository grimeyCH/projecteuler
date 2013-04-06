package com.incredigrimm.projecteuler;



/*
	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?
*/

public class Problem7 {

	public static void main(String[] args) {
		Problem7 myPrimeSearch = new Problem7();
		System.out.println("Already solved: 104743");
		int whichPrime = 10001;
		//int whichPrime = 15;
		myPrimeSearch.findPrime(whichPrime);
	}
	
	private boolean isPrime(long p){
		if (p == 2){
			return true;
		}
		if (p%2 == 0){
			return false;
		}
		for (int i = 3; i <= (p/2); i=i+2){
			if(p%i == 0){
				return false;
			}
		}
		return true;
	}
	
	private void findPrime(int which){
		int primeCount = 0;
		for (long i = 3; primeCount < which; i=i+2){
			if (isPrime(i)){
				primeCount++;
				if(primeCount == (which-1)){
					System.out.println(i);
				}
			}
		}
	}

}
