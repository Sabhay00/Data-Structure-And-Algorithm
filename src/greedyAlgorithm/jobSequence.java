package greedyAlgorithm;
import java.util.*;

public class jobSequence {
	static class treeNode{
		String j;
		 int dl;
		 int pr;
		 
		 treeNode left;
		 treeNode right;
		 
	}	
	public static class myComparator implements Comparator<treeNode>{
		public int compare(treeNode x,treeNode y) {
		return y.pr - x.pr;	
		}
	}
	
	
	

	public static void main(String[] args) {
		int total_job = 4;
	PriorityQueue<treeNode> q = new PriorityQueue<>(total_job,new myComparator());	
		
		
	 String[] job = { "j1","j2","j3","j4"};
	 int[] dl = {1,2,1,2};
	 int[] profit = {50,10,15,25};
	 
	 
	 for(int i = 0 ; i < total_job; i++) {
		 treeNode newNode = new treeNode();
		 newNode.dl = dl[i];
		 newNode.j = job[i];
		 newNode.pr = profit[i];
		 
		 newNode.left =null;
		 newNode.right =null;
		 
		 q.add(newNode);
	 }
	 
	 
	 
	}



}
