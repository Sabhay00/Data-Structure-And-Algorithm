package Arrays;

public class rainTrapingProblem {

	static int trapRain(int[] arr) {
		int store = 0;
		int n = arr.length;
		int[] lMax = new int[n];
		int[] rMax = new int[n];
		lMax[0] = arr[0];
		for (int i = 1; i < n; i++) {
			lMax[i] = Math.max(arr[i], lMax[i - 1]);
		}
		rMax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			rMax[i] = Math.max(arr[i], rMax[i + 1]);
		}

		for (int i = 1; i < n - 1; i++) {
			store += (Math.min(lMax[i], rMax[i])) - arr[i];
		}
		return store;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 0, 1, 2, 5 };

		System.out.println(trapRain(arr));
	}

}
