package Recursion;

public class generateSubset {

	static void subsets(String S,String curr,int i) {
		if(i==S.length()) {
		System.out.print(curr + " ");
		return ;
		}
	subsets(S,curr,i+1);
	subsets(S,curr+S.charAt(i),i+1);
	return ;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
subsets("abc","",0);
	}

}
//time-complexity  = theta(2^n)