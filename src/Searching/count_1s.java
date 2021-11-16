package Searching;

public class count_1s

{

	static int count1s(int arr[]) 
	{
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < 1) {
				low = mid + 1;
			} else {
				if (arr[mid] != arr[mid - 1] || mid == 0) {
					return n - mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 0, 0, 0, 0, 1, 1, 1 };
		
		System.out.println(count1s(arr));

	}

}
