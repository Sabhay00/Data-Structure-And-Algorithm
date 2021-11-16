package Arrays;

public class removeDupticate {
	static int rmvDuplicate(int arr[]) {
		int n = arr.length;
		int res = 1;
		for(int i = 1 ; i< n;i++) {
			if(arr[res-1]!=arr[i]) {
		       arr[res]=arr[i];
			      res++;}
		}
	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,2,2,3,3};
	
		System.out.println("with duplicacy");
       for(int i = 0 ;i<arr.length;i++) {
	
    	   System.out.print( arr[i] + " ");
           }
       
      int res = rmvDuplicate(arr);
       System.out.println();
       System.out.println("without Duplicacy");
       for(int i = 0 ;i<res;i++) {
    		
    	   System.out.print( arr[i] + " ");
           }
	}

}
