package Arrays;

public class slidingWindowTech2 {
	static boolean isSubSum(int arr[], int sum) {
		int n = arr.length;
		int subSum = arr[0];
		int s = 0;
		for (int e = 1; e < n; e++) {
			while (subSum > sum && s < e - 1) {
				subSum -= arr[s];
				s++;
			}
			if (subSum == sum) {
				return true;
			}
			subSum += arr[e];
		}

		return (subSum == sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 8, 3, 2, 10, 3, 5 };

		System.out.println(isSubSum(arr, 18));

	}

}
