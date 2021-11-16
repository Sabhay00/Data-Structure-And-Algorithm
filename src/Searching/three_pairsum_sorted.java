package Searching;

public class three_pairsum_sorted {

	static boolean isTriplet(int[] arr, int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			if(isPairSum(arr,x-arr[i])) {
				return true;
			}
			
		}
		return false;
	}

	static boolean isPairSum(int[] arr, int x) {
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] == x) {
				return true;
			} else if (arr[left] + arr[right] < x) {
				left++;
			} else {
				right--;
			}
		}

		return false;
	}

	public static void main(String[] args) 
	{
	int[] arr = { 2, 3, 4, 8, 9, 20, 40 };

	System.out.println(isTriplet(arr,27));
	}

}
