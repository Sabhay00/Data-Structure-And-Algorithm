package greedyAlgorithm;
import java.util.*;
public class optimalmerge { 
	
	static int minCmp(int size , int[] file) {
		PriorityQueue<Integer> q = new PriorityQueue<>();
		int count = 0;
		for(int i = 0 ; i < size ; i++) {
			q.add(file[i]);
		}
		
		while(q.size()>1) {
			int temp = q.poll() + q.poll();
			count += temp;
			q.add(temp);
		}
		
		
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
	   int[] files = new int[size];
	   for(int i = 0 ; i < size ; i++) {
		   files[i] = sc.nextInt();
	   }
	   int comp = minCmp(size,files);
	   System.out.println(comp);

	}

}
