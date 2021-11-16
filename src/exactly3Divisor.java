
public class exactly3Divisor {
	static int countNumber(int n) {
		int res= 0 ;
		for(int i= 4;i<=n;i++) {
			int temp = 2;
			for(int j=2;j<n;j++) {
				
				if((i%j)==0) {
					temp++;}
				}
			if(temp==3) {
				res++;
			}
			
		}
		return res;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countNumber(12)); 
	}

}
