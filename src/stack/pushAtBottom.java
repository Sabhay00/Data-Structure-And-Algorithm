package stack;
import java.util.*;

public class pushAtBottom {
	
	public static void pushBottom(Stack<Integer> s,int data) {
		
			if(s.isEmpty()) {
				s.push(data);
				return;
			}
			int top = s.get(s.size()-1);
			s.pop();
			pushBottom(s,data);
			s.push(top);
		}
		

	

	public static void main(String[] args) {
Stack<Integer> S = new Stack<>();
S.push(1);
S.push(2);
S.push(3);
pushBottom(S,4);


while(!S.empty()) {
	System.out.println(S.peek());
	S.pop();
}

	}

}
