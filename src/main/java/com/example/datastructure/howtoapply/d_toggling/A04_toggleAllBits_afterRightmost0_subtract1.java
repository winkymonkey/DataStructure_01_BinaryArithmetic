package com.example.datastructure.howtoapply.d_toggling;

/**
 * *****************************************************************************
 * 
 * *****************************************************************************
 * I/P: 100		//1100100
 * O/P: 99		//1100011
 * 
 * *****************************************************************************
 */
public class A04_toggleAllBits_afterRightmost0_subtract1 {
	/*
	 * Toggle all bits after rightmost 1 (inclusive)
	 * 
	 * N = 100					//given number
	 * m = 1
	 * while ((N & m) == 0) {	//flip all the unset-bits until we find a 1
	 * 	 N = N ^ m;
	 * 	 m = m << 1;
	 * }
	 * N = N ^ m;				//flip the rightmost 1 bit
	 * 
	 */
}
