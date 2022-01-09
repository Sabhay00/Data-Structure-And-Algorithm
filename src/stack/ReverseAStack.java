package stack;
import java.util.*;

public class ReverseAStack {
	
	public static void pushAtBottom(Stack<Integer> s,int data) {
		if(s.isEmpty()) 
		{
			s.push(data);
			return;
		}
		
		int top = s.get(s.size()-1);
		s.pop();
		pushAtBottom(s,data);
		s.push(top);
	}
	
	
	public static void reverse(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.get(s.size()-1);
		s.pop();
		reverse(s);
		pushAtBottom(s,top);
		
}
 	
	

	public static void main(String[] args) {
		Stack<Integer> S = new Stack<>();
		S.push(1);
		S.push(2);
		S.push(3);
		reverse(S);
		
		while(!S.empty()) {
			System.out.println(S.peek());
			S.pop();
		}

	}

}
