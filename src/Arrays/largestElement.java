package Arrays;

public class largestElement {
	static int large(int arr[]) {
		int n = arr.length;
		int res = 0;
		for(int i = 1 ; i < n ; i++ ) {
			if(arr[i]>arr[res]) {
				res = i;
			} 
		}
	return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,12,5,10};
	System.out.println(large(arr));

	}

}

//time-complexity = theta (n)