package Bitwise;

public class setBitCount {
	static int bitCount(int n)
	{
	int res = 0;
	while(n>0) {
	res= res + (n&1);
    n=n>>1;
	}
	return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bitCount(8));

	}

}

//Time - Complexity = Theta(total bits in n)