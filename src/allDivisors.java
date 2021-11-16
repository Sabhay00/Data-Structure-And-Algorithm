
public class allDivisors {
	static void printDivisors(int n) {
		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		for (; i >= 1; i--) {
			if (n % i == 0) {
				if (i != n / i)
					System.out.println(n / i);
			}
		}
	}

	public static void main(String[] args) {
		printDivisors(25);

	}

}
