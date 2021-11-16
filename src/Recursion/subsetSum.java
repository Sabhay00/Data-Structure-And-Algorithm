package Recursion;

public class subsetSum {
	static int countSubset(int[] A,int n ,int sum) {
		if(n==0) {
			return (sum==0)?1:0;
		}
		return countSubset(A,n-1,sum)+countSubset(A,n-1,sum-A[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,15};
		int n=arr.length;
		int sum = 25;
		
		System.out.println(countSubset(arr,n,sum));

	}

}
