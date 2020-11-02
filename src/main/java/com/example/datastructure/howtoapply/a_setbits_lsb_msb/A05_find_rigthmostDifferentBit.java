package com.example.datastructure.howtoapply.a_setbits_lsb_msb;

/**
 * *****************************************************************************
 * Position of rightmost different bit
 * *****************************************************************************
 * Input: 	m = 11 (1011)
 * 			n = 9  (1001)
 * Output: 2
 * 
 * *****************************************************************************
 */

public class A05_find_rigthmostDifferentBit {
	/*
	 * x = m^n				//XOR will make all same bits as 0, and all different bit as 1
	 * 
	 * while (x > 0) {
	 *    position++;
	 * 	  if ((x & 1) == 1)		//if rightmost bit is 1
	 *       break;
	 * 	  else					//if rightmost bit is 0
	 *       x = x >> 1;
	 * }
	 * 
	 * print position
	 * 
	 */
}
