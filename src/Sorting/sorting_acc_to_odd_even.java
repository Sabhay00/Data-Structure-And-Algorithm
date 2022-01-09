package Sorting;

import java.util.*;

class My_Cmp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1%2 - o2%2;
	}
	
}
public class sorting_acc_to_odd_even {

	public static void main(String[] args) {
Integer arr[]= {10,12,5,6,3,8};
Arrays.sort(arr,new My_Cmp());
System.out.println(Arrays.toString(arr));
	}

}
