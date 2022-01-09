package Sorting;
import java.util.Arrays;

public class union_two_sorted_arrays {

	static void printUnion(int arr[], int brr[]) {
		int n = arr.length;
		int m = brr.length;

//		int temp[] = new int[m+n];
//		for(int i = 0; i < n ;i++) {
//			temp[i] = arr[i];
//		}
//		for(int i = 0 ; i < m ; i ++) {
//			temp[n+i] = brr[i];
//		}
//		Arrays.sort(temp);
//	for(int i =0 ;i < m+n ; i++ ) {
//		if(i>0 && temp[i]==temp[i-1]) {
//			continue;
//		}
//		else {
//			System.out.println(temp[i]);
//		}
//	}
//		
//	}		
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				i++;
				continue;
			}
			if (j > 0 && brr[j] == brr[j - 1]) {
				j++;
				continue;
			}

			if (arr[i] < brr[j]) {
				System.out.println(arr[i]);
				i++;
			}
			else if(arr[i]==brr[j]) {
					System.out.println(arr[i]);
					i++;
					j++;
				}	
			else {
				System.out.println(brr[j]);
				j++;
			}
		}
		while (i < n) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				i++;
				continue;
			}
			System.out.println(arr[i]);
			i++;
		}
		while (j < m) {
			if (j > 0 && brr[j] == brr[j - 1]) {
				j++;
				continue;
			}
			System.out.println(brr[j]);
			j++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 5, 8 };
		int brr[] = { 2, 8, 9, 10, 15 };

		printUnion(arr, brr);
	}

}
