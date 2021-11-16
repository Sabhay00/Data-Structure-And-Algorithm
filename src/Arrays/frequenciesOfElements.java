package Arrays;

public class frequenciesOfElements {

	static void countFrequency(int[] arr) {
		int n = arr.length;
		int count = 1;
		for(int i = 1 ;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				System.out.print(arr[i-1] + " ");
				System.out.println(count);
				count = 1;
			}
		
		}
		System.out.print(arr[n-1] + " "+ count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,10,10,20,20,30,30};
countFrequency(arr);
	}

}
