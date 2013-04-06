package com.incredigrimm.projecteuler;

public class EulerExecutor {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Problem10.main(args);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time for execution: " + (endTime - startTime) + " ms");
		
	}

}
