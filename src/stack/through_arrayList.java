package stack;
import java.util.ArrayList;

public class through_arrayList {
	
	public static class stack{
	     ArrayList<Integer> s = new ArrayList<>();
	
	public void push(int data) {
		s.add(data);
	}
	public boolean isEmpty() {
		return s.size() == 0; 
	}
	
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int pop = s.get(s.size()-1);
		s.remove(s.size()-1);
		return pop;
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return s.get(s.size()-1);
		}
	
	
	     }
	
	

	public static void main(String[] args) {
         stack s = new stack();
     s.push(1);
      s.push(2);
      s.push(3);
      
      
      while(!s.isEmpty()) {
    	  System.out.println(s.peek());
    	  s.pop();
      }

     

	}

}
