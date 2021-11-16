package Searching;

public class search_in_sorted_array {
	static int findIndex(int[] arr, int x) {
		int length = arr.length;

		int low = 0;
		int high = length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == x) {
				return mid;
			}
			if (arr[low] < arr[mid]) {
				if (x >= arr[low] && x < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (x >= arr[mid] && x < arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}

		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 8, 9 };
		System.out.println(findIndex(arr,30));
	}

}
