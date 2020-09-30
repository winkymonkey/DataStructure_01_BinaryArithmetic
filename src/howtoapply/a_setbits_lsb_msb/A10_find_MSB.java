package howtoapply.a_setbits_lsb_msb;

/**
 * *****************************************************************************
 * Find most significant set bit of a number
 * *****************************************************************************
 * I/P: 10		//1010
 * O/P: 4		//Most significant set-bit is at 4th position from right
 * 
 * *****************************************************************************
 */
public class A10_find_MSB {
	/*
	 * -----------------
	 * ---RIGHT SHIFT---(it will give you the index of MSB)
	 * -----------------
	 * position = 0;
	 * while(n > 1) {
	 * 	 n = (n >> 1);		//right-shift until the number becomes 0... And track counter
	 * 	 position++;
	 * }
	 * //print (position+1)
	 * 
	 * 
	 * 
	 * ---------------
	 * ---O(1) TIME---(it will give you the number which is equal to [2 power index of MSB])
	 * ---------------
	 * n = n | (n>>1)
	 * n = n | (n>>2)
	 * n = n | (n>>4)
	 * n = n | (n>>8)
	 * n = n | (n>>16)
	 * n = n + 1;		//so that there remains only one set bit which is just before original MSB
	 * return (n >> 1)
	 * 
	 */
}
