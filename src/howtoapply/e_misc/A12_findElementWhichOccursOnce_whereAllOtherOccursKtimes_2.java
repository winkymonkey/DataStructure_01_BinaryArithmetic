package howtoapply.e_misc;

/**
 * *****************************************************************************
 * Unique element in an array where all elements occur k times except one
 * *****************************************************************************
 */
public class A12_findElementWhichOccursOnce_whereAllOtherOccursKtimes_2 {
	public static void main(String[] args) {
		int A[] = {6, 2, 5, 2, 2, 6, 6};
		int k = 3;
		int n = A.length;
		System.out.println(findUnique(A, n, k));
	}
	
	
	private static int findUnique(int A[], int n, int k) {
		int count[] = new int[32];
		for(int i=0; i<32; i++) {
			count[i] = 0;
		}
		
		for (int i=0; i<32; i++)
	        for (int j=0; j<n; j++)
	            if ((A[j] & (1 << i)) != 0)
	                count[i] += 1;
		
		int res = 0;
	    for(int i=0; i<32; i++)
	        res = res + (count[i] % k) * (1 << i);
	    return res;
	}
}

/*
int A[] = {2, 2, 2, 10, 2};
int k = 4;
*/