package Recursion;

public class ropeCuttingProblem {
	static int maxCut(int num,int a,int b,int c) {
		if(num==0) {
			return 0;
		}
		if(num<0) {
			return -1;
		}
		int res=Math.max(maxCut(num-a,a,b,c),Math.max(maxCut(num-b,a,b,c),maxCut(num-c,a,b,c)));
		if(res==-1) {
			return -1;
		}
		
		return res+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(maxCut(5,2,1,5));
	}

}
