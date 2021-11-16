package Arrays;

public class n_bonacci_number {
	static void printN(int n,int m) {
	int[] arr = new int[m];
		for(int i = 0 ; i < n-1 ; i++) 
		{
		arr[i]= 0;	
		}
		arr[n-1] =1 ;
		for(int j = n ; j < m ; j++) {
			arr[j] = arr[j-1]+arr[j-2]+arr[j-3];
		}
		for(int i = 0;i < m; i ++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printN(3,8);
	}

}
