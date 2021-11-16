
public class GP {
	 public static double termOfGP(int A,int B,int N)
	    {
	        
	        float CD = (float)B/A;
	        System.out.println(CD);
	        double res = A;
	        while(N!=1){
	         res = Math.round(res * CD);
	            N=N-1;
	        }
	        return res;
	    }
	public static void main(String[] args) {
		System.out.println(termOfGP(73,37,2));

	}

}
