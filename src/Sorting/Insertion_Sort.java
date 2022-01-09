package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
	static void insertionSort(int[] arr) {
		for(int i = 1 ; i < arr.length ; i ++) {
			if(arr[i]<arr[i-1]) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
			j--;
			}
			arr[j+1]=key;
				}
			}
			
		}

	public static void main(String[] args) {

		int arr[] = { 2, 10, 8, 7 };

		insertionSort(arr);
		
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	
}
