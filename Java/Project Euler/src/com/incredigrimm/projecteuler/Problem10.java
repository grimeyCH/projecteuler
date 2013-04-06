package com.incredigrimm.projecteuler;

/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.

 */
public class Problem10 {

	public static void main(String[] args) {
		System.out.println("Correct answer: 142913828922");
		Problem10 mySumOfPrimes = new Problem10();
		mySumOfPrimes.findSumOfPrimes(1, 2000000);
		
	}
	
	private void findSumOfPrimes(long start, long boundary){
		long sum = 2;
		for (long i = start; i <= boundary; i=i+2){
//			System.out.println("i: " + i);
			//long startTime = System.currentTimeMillis();
			if(isPrime(i)){
				sum = sum + i;
			}
//			if(isPrime(i+2)){
//				sum = sum + (i+2);
//			}
			//System.out.println("Prime check in: " + (System.currentTimeMillis()-startTime));
		}
		System.out.println(sum);
	}
	
	private boolean isPrime(long p){
		boolean debug = false;
		if (debug){
			System.out.println("in check: " + p);
		}
		if (p==1){
			return false;
		} else if (p<4){
			if (debug){
				System.out.println("is prime(<4):" + p);
			}
			return true;
		} else if (p%2==0){
			return false;
		} else if (p<9){
			if (debug){
				System.out.println("is pirme(<9):" + p);
			}			
			return true;
		} else if (p%3==0){
			return false;
		}
		for (int i = 5;i<=((int)Math.sqrt(p)+1);i=i+6){
			if(p%i==0){
				return false;
			}
			if(p%(i+2)==0){
				return false;
			}
		}
		if (debug){
			System.out.println("is prime: " +p);
		}
		return true;
	}


}
