package howtoapply.e_misc;

/**
 * *****************************************************************************
 * Swap all odd and even bits
 * *****************************************************************************
 * I/P: 23		//00010111
 * O/P: 43		//00101011
 * 
 * *****************************************************************************
 */
public class A01_swapAllEvenAndOddBits {
	/*
	 * We can observe that,
	 * 	- we need to right shift (>>) all even bits by 1 so that they become odd bits
	 *  - we need to left shift (<<) all odd bits by 1 so that they become even bits
	 * 
	 * even_bits = n & 0xAAAAAAAA		//0xAAAAAAAA is 101010....31times
	 * odd_bits = n & 0x55555555		//0x55555555 is 010101....31times
	 * 
	 * even_bits = even_bits >> 1;
	 * odd_bits = odd_bits << 1;
	 * 
	 * output = (even_bits | odd_bits);		//Combine even and odd bits
	 * 
	 */
}
