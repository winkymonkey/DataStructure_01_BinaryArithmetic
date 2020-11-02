package com.example.datastructure.howtoapply.d_divisibility_multiplicity;

/**
 * *****************************************************************************
 * Write an Efficient Method to Check if a Number is Multiple of 3
 * *****************************************************************************
 */
public class A03_check_ifMultipleOf3 {
	/*
	 * ----------------
	 * ---PHILOSOPHY---
	 * ----------------
	 * N = 23	--- 10111
	 * X = Get count of all set bits at odd positions = 3
	 * Y = Get count of all set bits at even positions = 1
	 * If (X-Y) is a multiple of 3 then number is also a multiple of 3.
	 * 
	 * 
	 * 
	 * ---------------
	 * ---ALGORITHM---
	 * ---------------
	 * //handle when n<0, n==0, n==1
	 * 
	 * odd_count = 0;
	 * even_count = 0;
	 * 
	 * while (n!=0) {
	 * 	 if((n & 1) != 0)
	 * 		odd_count++;		//If odd bit is set then increment odd counter
	 * 	 n = n>>1;
	 * 
	 * 	 if((n & 1) != 0)
	 * 		even_count++;		//If even bit is set then increment even counter
	 * 	 n = n>>1;
	 * }
	 * 
	 */
}
