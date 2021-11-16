package Arrays;


public class maxSumCircularSubArr {
	static int maxSumNormal(int[] arr) {
		int res = arr[0] ;
		int max_ending = arr[0];
		int n = arr.length;
		
		for(int i =1 ; i < n ; i ++) {
			max_ending = Math.max(max_ending+arr[i], arr[i]);
			res = Math.max(max_ending, res);
			
		}
		return res;
	}
	
	static int overallMaxSum(int[] arr) {
		int arr_sum = 0;
		int n = arr.length;
		int sumNormal = maxSumNormal(arr);
		if(sumNormal< 0)
		{
			return sumNormal;
		}
		
		
	for(int i = 0 ; i < n ; i ++) { 
	 	arr_sum += arr[i];
	 	arr[i] = -arr[i];
		
	}
	int circular_sum  = arr_sum + maxSumNormal(arr);
	return Math.max(sumNormal, circular_sum);
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,2,-3,4};
	
	System.out.println(overallMaxSum(arr));
	
	}
	

}
