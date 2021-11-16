package Recursion;

public class reversePower {

	long power(int N,int R)
    {
        if(R==0){
            return 1;
        }
     long M = 1000000007;
    return (N)%M * (power(N,R-1))%M ;
 
        //Your code here
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}