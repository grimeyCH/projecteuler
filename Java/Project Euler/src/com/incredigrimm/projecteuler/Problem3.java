package com.incredigrimm.projecteuler;


//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem3 {

	public static void main(String[] args) {
		Problem3 myP = new Problem3();
		myP.start(600851475143L);
	}
	
	private void start(long a){
		long p = 2L;
		boolean found = false;
		while(!found){
			if(a%p==0){
				a=a/p;
				if(isPrime(a)){
					found=true;
				}
			}
			p=nextPrime(p);
		}
		System.out.println(a);
	}
	
	private boolean isPrime(long c){
		for (int i = 2; i < c/2; i++) {
			if(c%i==0){
				return false;
			}
		}
		return true;
	}
	
	private long nextPrime(long p){
		if(p==2){
			return 3L;
		} else {
			p=p+2L;			
			while(!isPrime(p)){
				p=p+2;
			}
		}
		return p;
	}

}
