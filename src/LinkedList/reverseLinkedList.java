package LinkedList;


public class reverseLinkedList {
	Node head;
	
class Node{
	String Data;
	Node next;
	 Node(String Data)
	 {
		 this.Data = Data;
		 this.next = null;
	 }
}
void addFirst(String data) {
	
	Node newNode = new Node(data);
	
	if(head==null) {
		head = newNode;
		return;
	}
	else {
	  newNode.next = head;
		head = newNode;
	}
}

void print() {
	Node currNode = head;
	while(currNode != null) {
		System.out.print(currNode.Data + "->");
		currNode = currNode.next;
	}
	System.out.println("null");
}

void reverseList() {

	if(head==null || head.next==null) {
		return;
	}
	
	Node previousNode = head;
	Node currNode = head.next;
	while(currNode != null) {
		
		Node nextNode = currNode.next;
		currNode.next = previousNode;
		
		previousNode = currNode;
		currNode = nextNode;
	}
	head.next = null;
	head = previousNode;

}

 public Node recursiveReverse(Node head) {
	 if(head == null || head.next == null) {
		 return head;
	 }
	 Node newHead = recursiveReverse(head.next);
	 
	 head.next.next = head;
	 head.next = null;
	 
	 return newHead;
 }

	
	
	public static void main(String[] args) {
		
		reverseLinkedList ll = new reverseLinkedList();
		ll.addFirst("man");
		ll.addFirst("is");
		ll.addFirst("a");
		ll.addFirst("superman");
		
		ll.print();
//		ll.reverseList();
//		ll.print();
		
		ll.head = ll.recursiveReverse(ll.head);
		ll.print();
		
//	LinkedList<String> ll = new LinkedList<>();
//	ll.add("hello");
//	ll.add("this");
//	ll.add("is");
//	ll.add("abhay");

	
	
	}

}
