package Sorting;

public class intersection_of_two_sorted_array {
	static void printIntersect(int arr[],int brr[]) {
	int	n1 = arr.length;
	int	n2 = brr.length;
		int i = 0;
		int j = 0;
		while(i < n1 && j < n2) {
			if(i>0 && arr[i]==arr[i-1]) {
				i++;
				continue;
			}
			if(arr[i]<brr[j]) {
			i++;	
			}
			else if(arr[i]==brr[j]) {
				
				System.out.println(arr[i]);
				i++;
				j++;
				
			}
			else {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,10,10,10,10,15,15,20};
int brr[] = {5,10,10,15,30};
printIntersect(arr,brr);
	}

}
