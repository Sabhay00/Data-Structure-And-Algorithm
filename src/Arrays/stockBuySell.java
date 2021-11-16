package Arrays;

public class stockBuySell {
	static int profit(int[] arr) {
		int profit = 0;
		int n = arr.length;
		for(int i = 1 ; i < n ; i ++) {
			if(arr[i]>arr[i-1]) {
				profit += arr[i] - arr[i-1];
			}
		}
	
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,5,3,8,12};
System.out.println(profit(arr));
	}

}


//time - complexity = theta(n)