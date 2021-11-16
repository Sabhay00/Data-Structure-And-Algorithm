
public class computingPower {
	static int Power(int x, int n) {
		if (n == 0)
			return 1;
		int temp = Power(x, n / 2);
		temp = temp * temp;
		if (n % 2 == 0)
			return temp;
		return temp * x;
	}

	public static void main(String[] args) {
		System.out.println(Power(2, 3));
	}

}
