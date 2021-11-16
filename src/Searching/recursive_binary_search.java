package Searching;

public class recursive_binary_search {

	static int Bsearch(int[] arr, int x, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] > x) {
			return Bsearch(arr, x, low, mid - 1);
		} else {
			return Bsearch(arr, x, mid + 1, high);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		System.out.println(Bsearch(arr, 30, 0, arr.length - 1));
	}

}
