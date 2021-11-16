package Searching;

public class square_root {
	static int sqRoot(int x) {
		int low = 1;
		int high = x;
		int ans = -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			int sqMid = mid * mid;
			if(sqMid == x) {
				return mid;
			}
			else if(sqMid > x) {
				high = mid -1 ; 
			}
			else {
				low =  mid +1;
				ans = mid;
			}
		}
	return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.out.println(sqRoot(10));
		
	}

}
