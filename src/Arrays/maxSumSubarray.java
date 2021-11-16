package Arrays;

public class maxSumSubarray {
	static int maxSum(int[] arr) {
		int n =arr.length;
		
		int max_ending= arr[0];
		int res = arr[0];
		for(int i=1;i<n;i++) {
			max_ending = Math.max(max_ending + arr[i], arr[i]);
			res = Math.max(max_ending, res);
		}
	
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {-5,1,-2,3,-1,2,-2};
System.out.println(maxSum(arr));
	}

}
