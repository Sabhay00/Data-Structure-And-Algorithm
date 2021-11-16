
public class Pal {
/*	static boolean isPal(int n) {
		int rev = 0;
		int temp = n;
		while (temp != 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;
		}
		return (rev == n);
	}*/
	
	 public static boolean isPalindrome(int x) {
	        int rev=0;
	        int temp=x;
	        while(temp!= 0){
	            rev=rev*10 + (temp%10);
	            temp=temp/10;
	        }
	
	return (temp==x);
	 }
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));

	}

}
