package Bitwise;

public class firstSetBit {
	public static int getFirstSetBit(int n){
        
	    int res=1;
	    for(int i=0;res<=n;i++) {
	    	 if((n&(res<<i))!=0) {
	    		 return (i+1);
	    	 }
	    }
	   return 0;
	            
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFirstSetBit(6));

	}

}
