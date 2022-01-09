package Sorting;

import java.util.Arrays;

public class selection_sort {

	static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {

			int min_ind = i;
			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] =arr[min_ind];
			arr[min_ind] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 10, 8, 7 };

		selectionSort(arr);
		
		
		System.out.println(Arrays.toString(arr));
	
	}

}
