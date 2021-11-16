package Arrays;
//equilibrium point

public class prefix_sum_2 {
	static boolean isEquiPoint(int[] arr) {
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		int l_sum = 0;
		for (int i = 0; i < n; i++) {
			if (l_sum == sum - arr[i]) {
				return true;
			}
			l_sum += arr[i];
			sum -= arr[i];
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {3,4,8,-9,20,6};
System.out.println(isEquiPoint(arr));
	}

}
