package core;

public class A01_DecimalToBinary {
	/*
	 * --------------------------
	 * ---ARITHMETIC OPERATION---
	 * --------------------------
	 * bin[];
	 * i = 0;
	 * while(n > 0) {
	 * 	 bin[i] = n%2;
	 * 	 n = n/2;
	 * 	 i++;
	 * }
	 * 
	 * //print bin[] in reverse order
	 * 
	 * 
	 * 
	 * --------------------------------------
	 * ---ARITHMETIC OPERATION (recursive)---
	 * --------------------------------------
	 * findBinary(n) {
	 * 	 if(n > 1)
	 * 		findBinary(n/2);
	 * 	 
	 * 	 //print n%2;
	 * }
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---BITWISE OPERATION---
	 * -----------------------
	 * for(i=31 to 0) {			//as integer is of size 32bits
	 * 	 k = n >> i;
	 * 	 if(k & 1 > 0)
	 * 		//print 1;
	 * 	 else
	 * 		//print 0;
	 * }
	 * 
	 */
}
