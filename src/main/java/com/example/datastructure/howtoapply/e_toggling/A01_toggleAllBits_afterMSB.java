package com.example.datastructure.howtoapply.e_toggling;

/**
 * *****************************************************************************
 * Toggle all bits after most significant bit
 * *****************************************************************************
 * Given a number, toggle all bits of it after most significant bit including MSB.
 * *****************************************************************************
 * I/P: 10		//1010
 * O/P: 5		//0101
 * 
 * I/P: 5		//101
 * O/P: 2		//010
 * 
 * *****************************************************************************
 */
public class A01_toggleAllBits_afterMSB {
	/*
	 * ----------------
	 * ---PHILOSOPHY---
	 * ----------------
	 * We can toggle a bit by doing XOR of it with 1	(1^0=1 and 1^1=0)
	 * 
	 * take X = 1
	 * do X<<1 and do N^X
	 * repeat until it crosses MSB of N
	 * 
	 * 
	 * 
	 * ---------------
	 * ---ALGORITHM---
	 * ---------------
	 * X = 1;
	 * while (X <= n) {
	 * 	 n = n^X;
	 * 	 X = X<<1;
	 * }
	 * 
	 */
}
