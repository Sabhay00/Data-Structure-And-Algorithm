package Bitwise;

public class lookUpTable {
	static Integer table[] = new Integer[256];
	static void intialize() {
		table[0]=0;
		for(int i=1; i<256;i++) {
			table[i]= (i&1) + table[i/2];
		}
	}
	static int bitCount(int n) {
	intialize();
	int res= 0;
	res = table [n & 0xff];
	n=n>>8;
	res = res + table [n & 0xff];
	n=n>>8;
	
	res = res + table [n & 0xff];
	n=n>>8;
	
	res = res + table [n & 0xff];
	n=n>>8;
	
	return res;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(	bitCount(40));

		
	}

}
//time-Complexity = Theta(1)
// but this algo require some preprocessing like the table has been made previously before running the code.