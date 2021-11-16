package Bitwise;



public class maximumAndValue {
	/*
	 * public static int maxAND (int arr[], int N) { int temp1 = 0; int temp2 = 0;
	 * for(int i=0;i<N;i++){ for(int j = i+1;j<N;j++){ temp2 = arr[i]&arr[j];
	 * if(temp2>temp1){ temp1=temp2; } } } return temp1; }
	 */
	
	public static int maxAND(int arr[],int n) {
		int temp = 0;
		int temp1 = 1;
		for(int i = 0 ;i<n;i++) {
			temp = 0 | arr[i];
		}
		for(int i=0;i<32;i++) {
			temp1=1<<i;
			int str=0;
			
		}
		
		
		
		
		
		
		
		int res=0;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[]{4,8,12,16}; 
	
		System.out.println(maxAND(intArray,4));

	}

}
