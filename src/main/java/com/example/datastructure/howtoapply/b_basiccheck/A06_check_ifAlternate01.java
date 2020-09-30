package com.example.datastructure.howtoapply.b_basiccheck;

/**
 * *****************************************************************************
 * Check if a number has bits in alternate pattern | Set-2 O(1) Approach
 * *****************************************************************************
 * I/P: 10		//1010
 * O/P: YES
 * 
 * I/P: 12		//1100
 * O/P: NO
 * 
 * *****************************************************************************
 */
public class A06_check_ifAlternate01 {
	/*
	 * X = n ^ (n >> 1)			//101010^010101=111111
	 * 
	 * Now check if all bits in X are 1 or not
	 * if(X & (X+1)  == 0)
	 * 	 //all bits are 1
	 * else
	 * 	 //all bits are not 1
	 * 
	 */
}
