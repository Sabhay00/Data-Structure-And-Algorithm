package Recursion;

public class towerOfHonoi {
	static void TOH(int n , char A,char B ,char C) {
		if(n==1) {
			System.out.println("move 1 from " + A + " to " + C);
			return ;
		}
		TOH(n-1,A,C,B);
		System.out.println("Move " + n + " from "+ A + " to "+ C);
		TOH(n-1,B,A,C);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TOH(3,'A','B','C');

	}

}
//T(1)=1
// T(n)=2T(n-1)+1
//time-complexity = theta (2^n)