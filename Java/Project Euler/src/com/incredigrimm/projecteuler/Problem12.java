package com.incredigrimm.projecteuler;



/*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
*/


public class Problem12 {
	private static boolean debug = false;

	public static void main(String[] args) {
		System.out.println("Correct Answer is: 76576500");
		Problem12 myTriangleFinder = new Problem12();
		myTriangleFinder.findTriangle();
	}
	
	private void findTriangle(){
		int factorCount = 0;
		int gesucht = 0;
		int factorGoal = 500;
		int searchLimit = 5000000;
//		while (factorCount < 501){
			for(int i = 1; i<searchLimit && factorCount < factorGoal;i++){
				factorCount = divisorCounter(nextTriangle(i));
				if (factorCount > factorGoal){
					gesucht = i;
				}
			}
//		}
		System.out.println(nextTriangle(gesucht));
	}
	
	private int divisorCounter(int toDevide){
		int count = 0;
		
		for (int i = 1; i < ((int)Math.sqrt(toDevide)+1); i++){
			if(toDevide%i==0){
				if(debug){
					System.out.println("Factors: " + i + " and " + (toDevide/i));
				}
				count=count+2;
			}
		}
		return count;
	}
	
	private int nextTriangle(int number){
		int triangle = 0;
		for (int i = 1; i<=number; i++){
			triangle = triangle + i;
		}
		if(debug){
			System.out.println("Next Triangle for " + number + " is: " + triangle);
		}
		return triangle;
	}
}
