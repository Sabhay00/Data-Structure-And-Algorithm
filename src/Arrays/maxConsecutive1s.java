package Arrays;

public class maxConsecutive1s {

	static int maxCount(int[] arr) {
		int res = 0;
		int curr = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				curr = 0;
			} else {
				curr++;
				res = Math.max(curr, res);
			}

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 0, 1, 1, 1, 0, 1, 1 };
		System.out.println(maxCount(arr));

	}

}
