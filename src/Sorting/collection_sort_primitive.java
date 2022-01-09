package Sorting;
import java.util.*;
public class collection_sort_primitive {


	public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	list.add(20);
	list.add(10);
	list.add(12);
	list.add(5);

	Collections.sort(list);
	
	System.out.println(list);
	
	Collections.sort(list,Collections.reverseOrder());
	
	System.out.println(list);
	}
	

}
