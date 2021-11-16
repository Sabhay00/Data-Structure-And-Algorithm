
public class digitsInFact {
	static int countDigit(int n) {
		if(n==0 || n==1) { return 1; }
		if(n<0) { return 0; }
		double count = 0;
	for(int i = n;i>0;i--) {
		count =count + Math.log10(i);
	}
	return (int)(Math.floor(count))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigit(120));

	}

}
