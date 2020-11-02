package com.example.datastructure.howtoapply.c_checking;

/**
 * *****************************************************************************
 * Check if a number is positive, negative or zero using bit operators
 * *****************************************************************************
 * I/P: 30
 * O/P: positive
 * 
 * I/P: -20
 * O/P: negative
 * 
 * I/P: 0
 * O/P: zero
 * 
 * *****************************************************************************
 */
public class A01_check_positiveOrNegative {
	/*
	 * POSITIVE::	n>>31---(0)		-n>>31---(-1)			(n>>31) - (-n>>31) = 1
	 * NEGATIVE::	n>>31---(-1)	-n>>31---(0)			(n>>31) - (-n>>31) = -1
	 * ZERO::		n>>31---(0)		-n>>31---(0)			(n>>31) - (-n>>31) = 0
	 * 
	 * 
	 * output = (n>>31) - (-n>>31);
	 * if(output==1)
	 * 	 	//POSITIVE
	 * else if(output==-1)
	 * 		//NEGATIVE
	 * else
	 * 		//ZERO
	 * 
	 */
}
