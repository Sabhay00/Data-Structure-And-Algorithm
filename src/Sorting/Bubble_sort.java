package Sorting;

import java.util.Arrays;

public class Bubble_sort {

	static void bubleSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 10, 8, 7 };

		bubleSort(arr);
		
		
		System.out.println(Arrays.toString(arr));
	}
}
