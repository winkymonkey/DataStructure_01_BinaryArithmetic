package com.example.datastructure.howtoapply.a_setbits_lsb_msb;

/**
 * *****************************************************************************
 * Count set bits in an integer
 * *****************************************************************************
 * I/P: 13		//1001
 * O/P: 2
 * 
 * I/P: 183		//10110111
 * O/P: 6
 * 
 * *****************************************************************************
 */
public class A06_count_setBits {
	/*
	 * Subtraction of 1 from a number, 
	 * 		toggles all the bits (from right to left) till the rightmost set bit(inclusive).
	 * So (n & (n-1)) operation, unset the right-most set bit.
	 * If we do (n & (n-1)) in a loop and count the no of times loop executes we get the number of set bits.
	 * 
	 * n = 9;
	 * count = 0;
	 * while (n > 0) {		//in each traversal we unset the right-most 1
	 * 	 n = n & (n-1);
	 * 	 count++;
	 * }
	 * 
	 * TIME -- O(log n)
	 * 
	 */
}
