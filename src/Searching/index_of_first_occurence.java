package Searching;

public class index_of_first_occurence {
	static int indexF(int arr[], int x) {
		int low = 0;
		int high = (arr.length) - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] == x) {
				if (arr[mid] != arr[mid - 1] || mid == 0) {
					return mid;
				} else {
					high = mid - 1;
				}

			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(indexF(arr, 2));
	}

}
