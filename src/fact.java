
public class fact {
	static int fact1(int n) {
		int fact = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		while (n != 1) {
			fact = fact * n;
			n = n - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(fact1(5));

	}

}
