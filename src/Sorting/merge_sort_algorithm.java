package Sorting;

import java.util.*;

public class merge_sort_algorithm {
	static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			left[i] = arr[l + i];
		}
		for (int i = 0; i < n2; i++) {
			right[i] = arr[m + i + 1];
		}

		int i = 0;
		int j = 0;
		int x = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[x++] = left[i++];

			} else {
				arr[x++] = right[j++];

			}
		}
		while (i < n1) {
			arr[x++] = left[i++];

		}
		while (j < n2) {
			arr[x++] = right[j++];
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 5, 30, 15, 7 };
		mergeSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));

	}

}
