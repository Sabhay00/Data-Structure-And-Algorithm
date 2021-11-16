package Arrays;

import java.util.ArrayList;

public class reverseArraySubgrp {
	 void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		for(int i = 0; i < n;i+=k ) {
			if(i+k<n) {
				reverse(arr,i,i+k-1);
			}
			else {
				reverse(arr,i,n-1);
			}
		}
		}
	 static void reverse(ArrayList<Integer> arr,int low, int high) {
		 while(low>high) 
		 {
			 int temp =arr.get(low);
			 arr.set(low, arr.get(high));
			 arr.set(high, temp);
			 low++;
			 high--;
			 
		 }
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int K = 3;
		ArrayList<Integer> arr = new ArrayList<>();
	}

}
