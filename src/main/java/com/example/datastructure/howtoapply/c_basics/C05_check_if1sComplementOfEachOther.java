package com.example.datastructure.howtoapply.c_basics;

/**
 * *****************************************************************************
 * Check if one of the numbers is 1s complement of the other
 * *****************************************************************************
 * I/P: a=10, b=5		//10=1010, 5=0101
 * O/P: yes
 * 
 * I/P: a=1, b=14		//1=0001, 14=1110
 * O/P: yes
 * 
 * *****************************************************************************
 */

public class C05_check_if1sComplementOfEachOther {
	/*
	 * X = a ^ b					//1010 ^ 0101 = 1111
	 * 
	 * if (X & (X+1)  == 0)			//01111 & 10000 = 00000
	 *    print yes
	 * else
	 *    print no
	 * 
	 */
}
