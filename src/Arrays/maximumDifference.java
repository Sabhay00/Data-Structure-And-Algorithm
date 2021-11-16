package Arrays;

public class maximumDifference {
	static int maxDiff(int arr[]) {
		int n = arr.length;
		int res = arr[1] - arr[0];
		int minValue = arr[0];
		for (int i = 1; i < n; i++) {
			res = Math.max(res, arr[i] - minValue);
			minValue = Math.min(minValue, arr[i]);
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 3, 4, 3, 10, 2, 8 };
		System.out.println(maxDiff(arr));
	}

}
