package trees;

import java.util.*;

public class Tree {
	static Scanner sc = null;
	
	static Node createTree() {
		Node root = null;
		
	    System.out.println("enter the data");
	     int data = sc.nextInt();
	     
	     if(data == -1) {
	    	 return null;
	     }
	     root = new Node(data);
	     
	     System.out.println("enter the left for " + data);
	     root.left = createTree();
	     
	     System.out.println("enter the rigth for "+  data);
	     root.right = createTree();
	     
	  return root;
	}
	
	static void Inorder(Node root) {
		if(root == null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data+ " ");
		Inorder(root.right);
	}
	
	static void Preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);
		
	}
	
	static void Postorder(Node root) {
		if(root == null) {
			return;
			
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	static int height(Node root) {
		if(root == null)
			return 0;
		
		return Math.max(height(root.left),height(root.right)) + 1;
	}
	
	static int size(Node root) 
	{
		if(root == null)
			return 0;
		return size(root.left) + size(root.right) + 1;
	}
	
	static int Max(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data,Math.max(Max(root.left), Max(root.right)));
		
	}
	static int Min(Node root) {
		if(root == null)
			return Integer.MAX_VALUE;
		return Math.min(root.data, Math.min(Min(root.left), Min(root.right)));
	}
	
	static void LevelorderTraversal(Node root) {
		
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node curr = q.poll();
			
			System.out.print(curr.data);
			
			if(curr.left != null)
				q.add(curr.left);
			
			if(curr.right != null)
				q.add(curr);
			
		}
		
	}
	
	
	public static void main(String[] args) {
	  sc = new Scanner(System.in);
	   Node root = createTree();
       
	   Inorder(root);
	   System.out.println();
	   
	   Preorder(root);
	   System.out.println();
	   
	   Postorder(root);
	   System.out.println();
	}
	

}
class Node {
	Node left,right;
	int data;
	
	Node(int data){
		this.data = data;
	}
}
