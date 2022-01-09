package Sorting;

import java.util.Arrays;

public class sort_two_merged_array {

	static void sort(int[] arr , int low, int high, int mid)
	{
		
		int n1 = mid - low+1;
		int n2 = high - mid;
		int[] left = new int[n1]; 
		int[] right = new int[n2];
		
		for(int i = 0 ; i < n1 ; i++) {
			left[i] = arr[i];
		}
		for (int i = 0; i< n2; i++) {
			right[i] = arr[mid+i+1];
		}
		
		
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		int i = 0;
		int j = 0;
		int x = 0;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[x] =left[i];
				x++;
				i++;
			}
			else {
				arr[x]=right[j];
				x++;
				j++;
			}
		}
		
		if(i<n1) {
			arr[x]=left[i];
			x++;
			i++;
		}
		else {
			arr[x] = right[j];
			x++;
			j++;
		
		}
	System.out.println(Arrays.toString(arr));	
	}
	
  public static void main(String args[]) { 
	
	int arr[] = {10,15,20,40,8,11,55};
	sort(arr,0,6,3);
	}
}
