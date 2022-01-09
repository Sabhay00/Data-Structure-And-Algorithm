package LinkedList;
import java.util.*;
public class palindrome {
	public static boolean isPalindrome(LinkedList<Integer> List) {
		
		
		return false;
	}
	
	

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		
		if(isPalindrome(list)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
