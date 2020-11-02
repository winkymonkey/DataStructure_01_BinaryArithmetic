package com.example.datastructure.howtoapply.b_basics;

/**
 * *****************************************************************************
 * Count set bits in a range
 * *****************************************************************************
 * Given a non-negative number N and two values L and R.
 * The problem is to count set bits from the rightmost L'th bit to the rightmost R'th bit.
 * (NOTE: 1 <= L <= R <= bits in N)
 * *****************************************************************************
 * I/P: N=79, L=2, R=5
 * O/P: 4
 * 			//79
 * 			//number --- 1001111
 * 			//index ---- 7654321
 * 			//bits in range 2nd to 5th index is 0111
 * 
 * *****************************************************************************
 */
public class A11_count_setBits_inRange {
	/*
	 * ----------------
	 * ---PHILOSOPHY---
	 * ----------------
	 * Produce a SPECIAL number having all bits set in the given rage of L to R
	 * Count set bits in that SPECIAL number
	 * 
	 * index of N-------7654321		//N=79, L=2, R=5
	 * Given N----------1001111
	 * SPECIAL number---0011110		//all bits set from 2nd(L'th) to 5th(R'th)
	 * Count of 1 is----4
	 * 
	 * 
	 * 
	 * ---------------
	 * ---ALGORITHM---
	 * ---------------
	 * find x = (1<<R)-1;				//0000001 becomes 0100000 becomes 0011111
	 * find y = (1<<(L-1))-1;			//0000001 becomes 0000010 becomes 0000001
	 * find SPECIAL = x^y;				//(0011111)^(0000001)=0011110
	 * 
	 * //now count set-bits in 'SPECIAL'
	 * count = 0;
	 * while (SPECIAL > 0) {
	 * 	  SPECIAL = SPECIAL & (SPECIAL-1);
	 * 	  count++;
	 * }
	 *
	 */
}
