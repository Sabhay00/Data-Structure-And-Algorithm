package queues;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class queue {
	 
	Node head;
	
	public void push(int x) {
		Node newNode = new Node(x);
		
		if(head==null) {
		head = newNode;
		return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	public int pop() {
		if(head==null)
			return -1;
		
		int pop = head.data;
		head = head.next;
		return pop;
	}
	
	public int peek() {
		if(head==null)
			return -1;
		return head.data;
	}
	


	public static void main(String[] args) {
	queue q = new queue();
	q.push(1);
	q.push(2);
	q.push(3);
	
	while(q.peek() != -1) {
		System.out.print(q.peek());
		q.pop();
	}
		

	}

}
