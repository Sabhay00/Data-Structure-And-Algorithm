package Searching;

public class pairsum_equal_to_x_sorted {
    static boolean pairSum(int[] arr, int x) {
    	int left = 0;
    	int right = arr.length -1;
    	while(left < right) {
    		if(arr[left]+ arr[right] == x) {
    			return true;
    		}
    		else if(arr[left]+ arr[right] < x) {
    			left++;
    		}
    		else {
    			right--;
    		}
    	}
    	
    	return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,4,8,9,11,12,20,30};
		System.out.println(pairSum(arr,23));
	}

}
