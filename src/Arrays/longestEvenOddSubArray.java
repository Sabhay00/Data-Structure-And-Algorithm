package Arrays;

public class longestEvenOddSubArray {
	static int lengthEvenOdd(int arr[]) {
		int length = 1;
		int res = 0;
		int n = arr.length;

		for (int i = 1; i < n; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {

				length++;

			} else {
				length = 1;
			}
			res = Math.max(res, length);
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 10, 20, 6, 3, 8 };
		System.out.println(lengthEvenOdd(arr));
	}

}
