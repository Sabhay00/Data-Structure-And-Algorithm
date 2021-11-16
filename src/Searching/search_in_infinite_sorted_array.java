package Searching;

public class search_in_infinite_sorted_array {
	
	static int Search(int[] arr,int x) {
		if(arr[0]==x) {
			return 0;
		}
		int i=1;
		while(arr[i]<x) {
		        if(arr[i]==x) {return i;}
		        i = i*2;
		}
		
		return bSearch(arr,i/2 + 1, i-1,x);
	}
	static int bSearch(int[] arr,int low,int high,int x) {
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(arr[mid]>x) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,20,40,60,80,100,120,300,400};
    System.out.println(Search(arr,100));
	}

}
