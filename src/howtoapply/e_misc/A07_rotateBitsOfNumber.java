package howtoapply.e_misc;

/**
 * *****************************************************************************
 * Rotate bits of a number
 * *****************************************************************************
 * I/P: n=229		//11100101
 * 		d=3			//rotate by 3 bits
 * O/P: 47			//00101111
 * 
 * *****************************************************************************
 */
public class A07_rotateBitsOfNumber {
	/*
	 * -------------------
	 * ---Left Rotation---
	 * -------------------
	 * If we simply left-shift, the leftmost d bits will be lost
	 * So before doing left-shift, we cleverly have to store the leftmost d bits
	 * --leftmost d bits can be captured by right-shift n by (n-d) times
	 * --let X = n >> (n-d)
	 * 
	 * Now we can simply left-shift n by d times
	 * --note that, it will introduce d number of 0s at right
	 * --let Y = n << d
	 * 
	 * The answer will be Z = X|Y
	 * 
	 * 
	 * 
	 * -------------------
	 * ---Right Rotation---
	 * -------------------
	 * Approach is similar as above.
	 * X = n << d
	 * Y = n >> (n-d)
	 * Z = X|Y
	 * 
	 */
}
