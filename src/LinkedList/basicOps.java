
package LinkedList;
import java.util.*;
public class basicOps {
//	private int size;
//	 
//	basicOps(){
//		this.size = 0;
//	}
//	
//	Node Head;
//	
//	class Node{
//		String Data;
//		Node next;
//	
//    Node(String Data){
//			this.Data  = Data ;
//			this.next = null;
//			
//	}
//	}
//	
//	
//	
//	//add - first,last
//	public void addFirst(String data) {
//		Node newNode = new Node(data);
//		size++;
//		if(Head == null) {
//			Head = newNode;
//			return;
//		}
//		else {
//			newNode.next = Head;
//			Head = newNode;
//		}
//	}
//	
//	public void addLast(String data) {
//		Node newNode = new Node(data);
//		size++;
//		if(Head==null) {
//			Head = newNode;
//			return;
//		}
//		else {
//		Node currNode = Head;
//		while(currNode.next != null){
//			currNode = currNode.next;
//		}
//		currNode.next = newNode;
//		}
//	
//	}
//	
//	//print
//	void print() {
//		if(Head==null) {
//			System.out.println("List is empty");
//			return;
//		}
//		
//		
//		Node currNode = Head;
//		while(currNode != null) {
//			System.out.print(currNode.Data + "-->");
//			currNode = currNode.next;
//		}
//		System.out.println("Null");
//	}
//	//delete
//	void deleteFirst() {
//		if(Head==null) {
//			System.out.println("List is empty");
//			return;
//		}
//		size--;
//		Head = Head.next;
//		
//	}
//	void deleteLast() {
//		if(Head==null) {
//			System.out.println("List is empty");
//		return;
//		}
//		size--;
//	   Node secondLast = Head;
//	   Node lastNode = Head.next;
//	   while(lastNode.next != null) {
//		   secondLast = lastNode;
//		   lastNode = lastNode.next;
//		   
//	   }
//	   secondLast.next = null;
//	}
//	//search 
//	void search(String data) 
//	{
//		Node currNode = Head;
//		if(currNode == null) {
//			System.out.println("empty");
//			return;
//		}
//		while( currNode != null  &&  currNode.Data != data  ) {
//			currNode  = currNode.next;
//		}
//		if(currNode!= null && currNode.Data == data) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("Not found");
//		}
//	}
//	
//	int getSize() {
//		return size;
//	}
	
public static void main(String[] args) 
{
LinkedList<String> ll = new LinkedList<>();
ll.addFirst("IS");
ll.addLast("A");
System.out.print(ll);
ll.add("List");
ll.addFirst("this");


System.out.println(ll);


for(int i = 0 ; i < ll.size(); i++) {
	System.out.print(ll.get(i)+"->");
	
}
System.out.println("null");





//basicOps List = new basicOps();
//
//List.addFirst("a");
//List.addFirst("is");
//
//List.print();
//
//List.addLast("list");
//List.print();
//
//List.addFirst("this");
//List.print();
//
//List.deleteFirst();
//List.print();
//List.deleteLast();
//List.print();
//
//List.search("l");
//System.out.println(List.getSize());
}
}
