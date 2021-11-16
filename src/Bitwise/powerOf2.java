package Bitwise;

//by brian karningam's Algo
public class powerOf2 {
	static boolean isPow2(int n) {
		return ((n!=0)&&((n&(n-1))==0));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(isPow2(6));
	}

}
