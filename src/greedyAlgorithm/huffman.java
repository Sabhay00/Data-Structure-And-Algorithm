package greedyAlgorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

class treeNode{
	char c;
	int freq;
	
	treeNode left;
	treeNode right;
	
	
}
class Mycomparator implements Comparator<treeNode>{
	
	public int compare(treeNode x,treeNode y) {
		return x.freq - y.freq;
	}
	
}

public class huffman {
	
	public static void printCode(treeNode root,String s) {
		
		if(root.left == null && root.right == null && Character.isLetter(root.c))
		{	
			System.out.println(root.c + ":" + s);
		return;
	}
		printCode(root.left,s + "0");
		printCode(root.right,s + "1");
		
		
	}
	

	public static void main(String[] args) {
		int n = 6;
		char[] ch = {'a','b','c','d','e','f'};
		int[] fr = {5,9,12,13,16,45};
		
		PriorityQueue<treeNode> q = new PriorityQueue<>(n,new Mycomparator());
		
		for(int i = 0 ; i < n ; i++) {
			treeNode newNode = new treeNode();
			newNode.c = ch[i];
			newNode.freq = fr[i];
			 newNode.left =null;
			 newNode.right = null;
			
			q.add(newNode);
		}
		
		treeNode root = null;
		
		while(q.size()>1) {
			treeNode x = q.peek();
			q.poll();
			
			treeNode y = q.peek();
			q.poll();
			
			treeNode f = new treeNode();
			f.freq = x.freq+y.freq;
			f.left = x;
			f.right = y;
			
			root = f;
			q.add(f);
					
		}
		
         printCode(root,"");
	}

}
