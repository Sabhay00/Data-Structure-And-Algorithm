package Bitwise;

public class rightmostDifferentBit {
	static int findBit(int n, int m) {
		int res= 1;
		
		while(res<=Math.max(m, n)) {
			int i = 0;
			res=1<<i;
			int temp1 = m & res;
			int temp2 = n & res;
			if(temp1!=temp2) {
				return (i+1);
			}
			i++;
			}
		return 0;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findBit(52,8);

	}

}
