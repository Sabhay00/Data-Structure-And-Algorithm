package Arrays;

public class prefix_sum_1 {
	static int getSum(int prefix_sum[],int l,int r) {

		if(l!=0) {
		    return prefix_sum[r]-prefix_sum[l];
		    
		}
		else {
			return prefix_sum[r];
		}
		
	}
	static void queries(int[] arr) {
		int n = arr.length;
		int prefix_sum[] = new int[n];
		prefix_sum[0] = arr[0];
		for(int i  = 1 ; i < n; i ++) {
			prefix_sum[i]= prefix_sum[i-1]+arr[i];
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
