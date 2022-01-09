package stack;

public class through_linkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
			this.next = null;
		}
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {

		Node newNode = new Node(data);
		if (isEmpty()) 
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public int pop()
	{
		if (isEmpty()) {
			return -1;
		}
		int pop = head.data;
		head = head.next;
		return pop;
	}

	public int peak() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		through_linkedList s = new through_linkedList();
		s.push(1);
		s.push(2);
		s.push(3);

		while (!s.isEmpty()) {
			System.out.println(s.peak());
			s.pop();
		}

	}

}
