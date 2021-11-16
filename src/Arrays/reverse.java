package Arrays;

public class reverse {
	static void Reverse(int arr[]){
		int n = arr.length;
		int low = 0;
		int	high = n-1;
		while(low < high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {1,2,3,4,5};
    System.out.println("before reverse");
    for(int i = 0 ; i < arr.length ; i++) {
    	System.out.print(arr[i] +" ");
    }
    Reverse(arr);
    System.out.println();
    System.out.println("after reverse");
    for(int i = 0 ; i < arr.length ; i++) {
    	System.out.print(arr[i] + " ");
    }	
	}

}

//time-complexity = theta (n)
