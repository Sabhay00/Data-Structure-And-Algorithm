package Sorting;
import java.util.Arrays;
public class inversion_two_sorted_array {
	
static int countInversion(int a[] , int l , int h) {
	int res = 0;
	if(l<h) {
		int m = l + (h-l)/2;
		res += countInversion(a,l,m);
		res += countInversion(a,m+1,h);
		res += countAndmerge(a,l,m,h);
	}
	return res;
}
static int countAndmerge(int a[],int l , int m , int h) {
	int n1 = m-l+1;
	int n2 = h-m;
	int left[] = new int[n1];
	int right[] = new int[n2];
	
	for(int i = 0 ; i < n1 ; i++) {
		left[i] = a[l+i];
	}
	for(int i = 0; i < n2 ; i ++) {
		right[i] = a[m+i+1]; 
	}
	int i = 0 , j = 0, k = l ,res = 0;
	while(i<n1 && j <n2) {
		if(left[i]<=right[j]) {
			a[k++] = left[i++];
		}
		else {
			a[k++] = right[j++];
			res += n1 - i;
		}
	}
	while(i<n1) {
		a[k++] = left [i++];
	}
	while(j<n2) {
		a[k++] = right[j++];
	}

return res; 	
}
	public static void main(String[] args)
	{
	int a[] = {2,5,8,11,3,6,9,13};
		
    System.out.println(countInversion(a,0,7));
    System.out.println(Arrays.toString(a));
	}

}
