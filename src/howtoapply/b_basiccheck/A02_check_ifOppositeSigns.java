package howtoapply.b_basiccheck;

/**
 * *****************************************************************************
 * Detect if two integers have opposite signs
 * *****************************************************************************
 * I/P: -1, 100
 * O/P: true
 * 
 * I/P: -100, -200
 * O/P: false
 * 
 * *****************************************************************************
 */
public class A02_check_ifOppositeSigns {
	/*
	 * Let the given integers be X and Y.
	 * For negative numbers --- sign bit is 1
	 * For positive numbers --- sign bit is 0
	 * 
	 * X^Y will have the sign bit as 1 iff they have opposite sign
	 * --> X^Y will be negative number number iff they have opposite sign
	 * 
	 * X = 100;
	 * Y = -100
	 * z = X^Y;
	 * if(z < 0)
	 * 	 //print "opposite sign"
	 * else
	 * 	 //print "same sign"
	 * 
	 */
}
