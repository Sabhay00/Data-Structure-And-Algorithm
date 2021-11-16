package Arrays;

public class leadersInArray {
	static void leaders(int[] arr) {
		int n = arr.length;
	int curr_ldr = arr[n-1];
	System.out.print(curr_ldr + " ");
	for(int i = n-2; i>=0;i--)
	{
		if(curr_ldr < arr[i])
		{
			curr_ldr= arr[i];
			System.out.print(curr_ldr +" ");
		}
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 2, 3, 7, 4, 5 };
		leaders(arr);
	}

}
