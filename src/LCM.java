
public class LCM {
	static int lcm(int a, int b) {
		int x = Math.max(a, b);
		int i = 1;
		while (x > 0) {
			if (x % a == 0 && x % b == 0) {
				return x;
			}
			x = x * i;
			i = i + 1;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(lcm(4, 6));
	}

}
