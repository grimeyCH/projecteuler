package com.incredigrimm.projecteuler;
/*

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
public class Problem9 {

	public static void main(String[] args) {
		Problem9 myPythagoras = new Problem9();
		myPythagoras.findPythagorean();
	}
	
	private void findPythagorean(){
		int targetSum = 1000;
		for (int i = 1; i<targetSum;i++){
			for(int j = i+1;j<targetSum;j++){
				for(int k=j;k<targetSum;k++){
					if((i+j+k)==targetSum){
						if(isPythagorian(i,j,k)){
							System.out.println(i*j*k);
						}
					}
				}
			}
		}
	}
	
	private boolean isPythagorian(int a, int b, int c){
		if (((a*a)+(b*b))==(c*c)){
			return true;
		} else {
			return false;
		}
	}

}
