package Arrays;

public class leftRotateByOne {
	static void rotate(int arr[]) {
		int n = arr.length;
		int temp = arr[0];
		for(int i = 1 ;i < n ; i++) {
			arr[i-1] = arr[i];
			 	
		}
		arr[n-1] = temp;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};

		rotate(arr);

		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}	
			}

	}

//time-complexity = theta (n)
