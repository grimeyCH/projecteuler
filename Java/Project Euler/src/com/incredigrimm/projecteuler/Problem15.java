package com.incredigrimm.projecteuler;



/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

	b
a	[][][]
	[][][]
	[][][]



How many such routes are there through a 20×20 grid?
*/

public class Problem15 {

	public static void main(String[] args) {
		Problem15 myGridRoutes = new Problem15();
		myGridRoutes.getPossibleRoutes();
	}
	
	private void getPossibleRoutes(){
		int routes = 0;
		//For loop a rows 
		for(int i = 0; i<20;i++){
			for(int j = 0;j<20;j++){
				for(int k = 0;k<20;k++){
					routes++;
				}
			}
		}
		System.out.println(routes);
	}

}
