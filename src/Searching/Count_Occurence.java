package Searching;

public class Count_Occurence {

	static int countOccur(int arr[], int x) {
		int first = firstOccur(arr, x);
		if (first == -1) {
			return 0;
		} else {
			return (lastOccur(arr, x) - first + 1);
		}
	}

	static int firstOccur(int arr[], int x) {
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x) {
				high = mid - 1;
			} else if (arr[mid] < x) {
				low = mid + 1;
			} else {
				if (arr[mid] != arr[mid - 1] || mid == 0) {
					return mid;
				} else {
					high = mid - 1;
				}
			}

		}

		return -1;
	}

static int lastOccur(int arr[],int x) {
	int n = arr.length;
	int low = 0;
	int high = n - 1;
	while (low <= high) {
		int mid = (low + high) / 2;
		if (arr[mid] > x) {
			high = mid - 1;
		} else if (arr[mid] < x) {
			low = mid + 1;
		} else {
			if (arr[mid] != arr[mid + 1] || mid ==n-1) {
				return mid;
			} else {
				low = mid + 1;
			}
		}

	}

	return -1;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 2, 3, 3 };
		System.out.println(countOccur(arr, 2));
	}

}

//time-complexity = O(logn)