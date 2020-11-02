package com.example.datastructure.howtoapply.b_basics;

/**
 * *****************************************************************************
 * Copy set bits in a range
 * *****************************************************************************
 * Given two numbers X and Y, and a range [L, R] where 1<=L, R<=32
 * The task is consider set bits of Y in range [L, R] and set these bits in X also
 * *****************************************************************************
 * I/P: X=10, Y=13		L=2, R=3
 * O/P: X=14
 * 
 * X=10---1010
 * Y=13---1101
 *         ^^
 * 				//there is only one set bit in Y at index 3 (in the range) 
 * 				//so if we set set-bit at index 3 of X, then X becomes 1110, which is 14
 * 
 * I/P: X=8, Y=7		L=1, R=2
 * O/P: X=11
 * 
 * *****************************************************************************
 */

public class B03_copy_setBits_inRange {
	/*
	 * 
	 */
}
