package greedyAlgorithm;
import java.util.*;
class itemValue{
	double cost;
	double weight,val,ind;
	itemValue(int w,int v,int ind){
		this.weight = w;
		this.val =  v;
		this.ind = ind;
		this.cost =((double)val/(double) weight);
	}
	
}

public class knapsack {
	
	
	static double max(int[] w,int[] p,int cap) {
		itemValue[] items = new itemValue[w.length];
		
	 for(int i = 0 ; i < w.length ; i++) {
		 items[i] = new itemValue(w[i],p[i],i);
	}
	 
	 Arrays.sort(items,new Comparator<itemValue>() {
	 
	 public int compare(itemValue o1,itemValue o2) 
	 {
		 return  Double.compare(o2.cost, o1.cost);
		 
		 
	 }
	 });
	 
	 double totalValue = 0d;
	 
	 for(itemValue i : items) {
		 int curWgt = (int)i.weight;
		 int curVal = (int)i.val;
		 
		 if(cap - curWgt >= 0) {
			 cap -= curWgt;
			 totalValue += curVal;
		 }
		 else {
			 double fraction = (double)cap /(double)curWgt;
			 totalValue  += (fraction * curVal);
			 cap -= (int)(fraction*curWgt);
			 
			 break;
			 
		 }
		 
	 }
	 
	 
	 
	return totalValue;
	}
	

	public static void main(String[] args) {
	   int[] w = {10,20,30};
	   int[] p = {5,30,20};
	   
	   System.out.println(max(w,p,20));
	   
	}

}
