package com.example.datastructure.howtoapply.d_toggling;

/**
 * *****************************************************************************
 * Add 1 to a given number
 * *****************************************************************************
 * I/P: 99		//1100011
 * O/P: 100		//1100100
 * 
 * *****************************************************************************
 */
public class A03_toggleAllBits_afterRightmost1_add1 {
	/*
	 * Toggle all bits after rightmost 0 (inclusive)
	 * 
	 * N = 100					//given number
	 * m = 1
	 * while ((N & m) == 1) {	//flip all the set-bits until we find a 0
	 * 	 N = N ^ m;
	 * 	 m = m << 1;
	 * }
	 * N = N ^ m;				//flip the rightmost 0 bit
	 * 
	 */
}
