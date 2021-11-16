package Searching;

public class peak_element {

	static int Peak(int[] arr) {

		int low = 0;
		int n = arr.length;
		int high = n - 1;
		while (low <= high) {

			int mid = (low + high) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
				return arr[mid];
			} else {
				if (mid > 0 && arr[mid - 1] > arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 40, 8, 7, 10, 6 };

		System.out.println(Peak(arr));
	}

}
