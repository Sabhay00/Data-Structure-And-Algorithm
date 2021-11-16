
public class GCD {
	static int gcd(int a, int b) {
		int x = Math.abs(a - b);
		while (a % x != 0 && b % x != 0) {
			x = x - 1;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(gcd(100, 200));

	}

}
