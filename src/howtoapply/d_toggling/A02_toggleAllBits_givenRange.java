package howtoapply.d_toggling;

/**
 * *****************************************************************************
 * Toggle bits in the given range
 * *****************************************************************************
 * Given a non-negative number N and two values L and R.
 * The problem is to toggle bits from the rightmost L'th bit to the rightmost R'th bit.
 * A toggle operation flips a bit 0 to 1 and a bit 1 to 0. 
 * *****************************************************************************
 * I/P: n=17, L=2, R=3
 * O/P: 23
 * 					//17
 * 					//number -------- 10001
 * 					//index --------- 54321
 * 					//bits in range 2nd to 5th index is 00
 * 					//bits in range 2nd to 5th index will be toggled as 11
 * 					//after toggle----10111
 * 					//23
 * 
 * *****************************************************************************
 */
public class A02_toggleAllBits_givenRange {
	/*
	 * ----------------
	 * ---PHILOSOPHY---
	 * ----------------
	 * Produce a SPECIAL number having all bits set in the given rage of L to R
	 * Now do (n^SPECIAL)
	 * This will toggle the bits in the range L to R in n.
	 * 
	 * x = (L<<R) – 1)
	 * y = (1<<(L-1)) – 1)
	 * SPECIAL = x^y
	 * 
	 * n = n^SPECIAL
	 * 
	 */
}
