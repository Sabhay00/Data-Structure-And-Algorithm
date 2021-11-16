package Recursion;

public class countDigits {
	 static int i=0;
    // complete the below function
    public static int countDigits(int n)
    {
        if(n==0){
            return 1;
        }
        i+=1;
    countDigits(n/10);
    return i;
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(countDigits(605));
	}

}
