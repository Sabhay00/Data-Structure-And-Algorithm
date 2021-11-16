package Recursion;

public class digitalRoot {
	public static int digitalRoot(int n)
    { 
        int temp = n;
     
        if(temp==0){
            return 0;
        }
        n= n%10 + digitalRoot(temp/10);
        if(n>=10){
        n = digitalRoot(n);
        }
        
        return n; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(digitalRoot(99999));
	}

}
