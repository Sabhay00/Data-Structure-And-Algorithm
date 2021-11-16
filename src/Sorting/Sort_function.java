package Sorting;
import java.util.Arrays;

public class Sort_function {

	static void sort(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {20,30,10,50,40};
		sort(arr);

	}

}
