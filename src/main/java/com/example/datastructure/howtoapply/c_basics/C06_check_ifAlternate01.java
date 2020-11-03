package com.example.datastructure.howtoapply.c_basics;

/**
 * *****************************************************************************
 * Check if a number has bits in alternate pattern
 * *****************************************************************************
 * Input:  42		(101010)
 * Output: yes
 * 
 * Input:  12		(1100)
 * Output: no
 * 
 * *****************************************************************************
 */

public class C06_check_ifAlternate01 {
	/*
	 * X = n ^ (n >> 1)					//101010 ^ 010101 = 111111
	 * 
	 * if (X & (X+1)  == 0)				//0111111 & 1000000 = 0000000
	 *    print yes
	 * else
	 *    print no
	 * 
	 */
}
