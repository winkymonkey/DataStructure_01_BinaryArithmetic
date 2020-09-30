package com.example.datastructure.howtoapply.c_divisibility_multiplicity;

/**
 * *****************************************************************************
 * Program to find whether a no is power of two
 * *****************************************************************************
 * I/P: 24
 * O/P: yes
 * 
 * I/P: 37
 * O/P: no
 * 
 * *****************************************************************************
 */
public class A01_check_ifPowerOf2 {
	/*
	 * -----------------
	 * ---LOG MENTHOD---
	 * -----------------
	 * if(ceil(log(n)) == floor(log(n)))
	 * 	 //print YES
	 * else
	 * 	 //print NO
	 * 
	 * 
	 * 
	 * --------------------
	 * ---COUNT SET BITS---
	 * --------------------
	 * All 'power of 2' numbers have
	 *  - only one bit set (i.e. 4=100, 8=1000, 16=10000, 32=100000 etc)
	 * 
	 * n = 9;
	 * count = 0;
	 * while(n > 0) {
	 * 	 n = n & (n-1);		//in each traversal we unset the right-most 1
	 * 	 count++;
	 * 	 if(count>1)
	 * 		break;			//print NO
	 * }
	 * 
	 * 
	 * 
	 * --------------
	 * ---USING OR---
	 * --------------
	 * If we subtract 1 from a power of two number, all bits gets reversed.
	 * [4,3] -> [100,011]
	 * [128,127] -> [10000000,01111111]
	 * So if we do (n & (n-1)) the answer will be 0
	 * 
	 * if(x==0)
	 * 	 //print NO
	 * else if((n & (n-1))==0)
	 * 	 //print YES
	 * else
	 * 	 //print NO
	 * 
	 * 
	 * 
	 * -------------------
	 * ---FACTORIZATION---
	 * -------------------
	 * while(n != 1) {
	 * 	 if(n%2 != 0)			//if at any step n becomes odd, then return
	 * 		return false;
	 * 	 n = n/2;
	 * }
	 */
}
