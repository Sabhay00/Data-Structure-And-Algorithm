package Searching;

public class median_of_two_sorted_array {

	static int findMedian(int[] A1, int[] A2) {

		int n1 = A1.length;
		int n2 = A2.length;
		int begin = 0;
		int endl = n1;
		while (begin <= endl) {
			int i1 = (begin + endl) / 2;
			int i2 = (n1 + n2 + 1) / 2 - i1;

			int min1 = (i1 == n1) ? Integer.MAX_VALUE : A1[i1];
			int max1 = (i1 == 0) ? Integer.MIN_VALUE : A1[i1 - 1];
			int min2 = (i2 == n2) ? Integer.MAX_VALUE : A2[i2];
			int max2 = (i2 == 0) ? Integer.MIN_VALUE : A2[i2 - 1];

			if (max1 <= min2 && max2 <= min2) {
				if ((n1 + n2) % 2 == 0) {
					return (Math.max(max1, max2) + Math.max(min1, min2))/2;
				} else {
					return Math.max(max2, max1);
				}

			} else {
				if (max1 > min2) {
					endl = i1 - 1;
				} else {
					begin = i1 + 1;
				}
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		int A1[] = { 10, 20, 30, 40, 50 };
		int A2[] = { 5, 15, 25, 30, 35, 55, 65, 75, 85 };
		
		System.out.println(findMedian(A1,A2));

	}

}
//time complexity = O(log(n1)) where n1 <=n2