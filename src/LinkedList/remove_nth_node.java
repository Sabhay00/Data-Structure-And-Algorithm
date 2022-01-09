package LinkedList;

  class Node{
	int data;
	Node next;
	
	
	Node(int x){
		this.data = x;
		this.next = null;
	}
}

public class remove_nth_node {
	static Node Head;
	int size = 0;
	int Size() {
		size = 0;
		Node currNode = Head;
		while(currNode != null) {
			size++;
			currNode = currNode.next;
		}
		
		return size;
	}
	
	void remove(int n) {
		if(Head==null || Head.next == null) {
			return;
		}
		Node prevNode = Head;
		int nodefStart = size-n+1;
		int count = 1;
		while (count < nodefStart)
		{
			count++;
			prevNode = prevNode.next;
		}
		prevNode.next = prevNode.next.next;
	}
	

	public static void main(String[] args) {

		 Head = new Node(10);
		Head.next = new Node(20);
		Head.next.next = new Node(30);
         Head.next.next.next = new Node(40);
         
         remove_nth_node temp = new remove_nth_node();
       
	System.out.println(temp.Size());
	
	temp.remove(2);
	System.out.println(temp.Size());
	
	
	
	}

}
