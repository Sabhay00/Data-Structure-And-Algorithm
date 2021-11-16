package Arrays;

public class maximum_index {

	static int maxIndex(int[] arr) {
		int res = 0;

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--)
			{
				if (arr[j] > arr[i]) {
					int curr_max = j - i;
					res = Math.max(res, curr_max);
				}

			}

		}

		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		System.out.println(maxIndex(A));
	}

}
