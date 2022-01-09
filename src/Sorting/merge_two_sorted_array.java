package Sorting;

public class merge_two_sorted_array {
	static void mergeArray(int[] a, int[] b) {
		
		int i = 0;
		int j = 0;
		while(i < a.length && j < b.length){

			if (a[i] <= b[j]) {
				System.out.println(a[i]);
				i++;
			} else {
				System.out.println(b[j]);

				j++;

			}

		}
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		while(j<b.length) 
		{
		System.out.println(b[j]);
		j++;
		}
		
		
	}

	public static void main(String[] args) {

		int[] a = { 10, 15, 20 };

		int[] b = { 5, 6, 6, 15 };

		mergeArray(a, b);
	}

}


//time-Complexity = theta(m+n)