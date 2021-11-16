package Bitwise;

public class brainKerningamAlgo {
	static int bitCount(int n) {
		int res = 0;
		while(n>0) {
			res++;
			n = n & (n-1);
			}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitCount(5));

	}

}
// Time-Complexity = theta(set count bit)