package Searching;

public class Binary_search {
	static int bSearch(int[] arr,int x) {
		int n = arr.length;
		int low  = 0;
		int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,20,30,40,50,60};
      System.out.println(bSearch(arr,30));

	}

}
