package Arrays;

public class slidingWindowTech {

	static int maxSum(int[] arr, int k) {
		int n = arr.length;
		int curr_sum = arr[0];

		for (int i = 1; i < k; i++) {
			curr_sum += arr[i];
		}
		int max_sum = curr_sum;
		for (int j = k; j < n; j++) {
			curr_sum += (arr[j] - arr[j - k]);

			max_sum = Math.max(max_sum, curr_sum);

		}
		return max_sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 2, 10, 3, 5 };

		System.out.println(maxSum(arr, 3));
	}

}
