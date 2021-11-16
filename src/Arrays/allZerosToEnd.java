package Arrays;

public class allZerosToEnd {
	static void moveZeros(int arr[]) {
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++) {
		  if(arr[i]!= 0){
			  
			  int temp = arr[i];
			  arr[i] = arr[count];
			  arr[count] = temp;
			  System.out.print(arr[i]+ " "+arr[count]);
			  count++;
			  System.out.println(count);
			  
			  
		  }	
		 
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,0,3,0,4,0};

moveZeros(arr);

for(int i = 0 ; i < arr.length ; i++) {
	System.out.print(arr[i] + " ");
}	
	}

}
