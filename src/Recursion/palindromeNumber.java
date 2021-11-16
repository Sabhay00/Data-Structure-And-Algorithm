package Recursion;

public class palindromeNumber {
	static boolean isPal(String str,int start,int end) {
		if(start>=end) {
			return true;
		}
		return (str.charAt(start)==str.charAt(end)) && isPal(str,start+1,end-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String str = "abababa";
System.out.println(isPal(str,0,(str.length()-1)));
	}

}
