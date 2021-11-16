package Arrays;

public class leftRotateByD {
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,d-1);
        
        reverse(arr,d,n-1);
        
        reverse(arr,0,n-1);
        
    }
    static void reverse(int arr[],int low,int high)
    {
         while(low<high)
        {
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {1,2,3,4,5};
		rotateArr(arr,2,5);
       for(int i = 0 ; i < arr.length ; i++)
       {
		  System.out.print(arr[i] + " ");
	    }	
	}

}
