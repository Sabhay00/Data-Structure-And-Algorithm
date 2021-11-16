package Recursion;

public class josephusProblem {
	static int jos(int n,int k) {
		if(n==0) {
			return 0;
		}
		return (jos(n-1,k)+k)%n;
	}
	public static void main(String[] args) {
		
		System.out.println(jos(5,3));
		// TODO Auto-generated method stub

	}

}
//time-complexity T(n)=T(n-1)+1;
//theta(n)

