package howtoapply.c_divisibility_multiplicity;

/**
 * *****************************************************************************
 * Multiplication of two numbers with shift operator
 * *****************************************************************************
 * I/P: n = 25 , m = 13
 * O/P: 325
 * 
 * *****************************************************************************
 */
public class A06_multiply_withAnyNumber {
	/*
	 * n=25	//11001
	 * m=13	//1101
	 * 
	 *       11001
	 *        1101
	 *       -----
	 *       11001
	 *      00000x
	 *     11001xx
	 *    11001xxx
	 *  ------------
	 *  sum them all
	 * 
	 * 
	 * answer = 0;
	 * count = 0;
	 * while(m > 0) {
	 * 	 if(m%2 == 1)
	 * 		answer = answer + (n << count);
	 * 	
	 * 	 count++;
	 * 	 m = m/2;
	 * }
	 * 
	 */
}
