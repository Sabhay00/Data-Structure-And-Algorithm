package Arrays;

public class secondLargestElement {
  
	static int secondLarge (int arr []) {
		int n = arr.length;
		int res = -1;
		int largest = 0;
		for (int  i = 1; i < n ; i ++) {
			if(arr[i]>arr[largest]) {
				res = largest;
				largest= i;
				
			}
			else if(arr[i]!=arr[largest]) {
				if(res == -1 || arr[i]>arr[res]) {
					res = i;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,35,23,2,45,12};
		System.out.println(secondLarge(arr));

	}

}

//time-complexity = theta(n)
