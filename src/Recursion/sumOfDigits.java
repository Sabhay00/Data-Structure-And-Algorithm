package Recursion;

public class sumOfDigits {
  static int sum(int num) {
	 if(num==0) {
		 return 0;
	}
	 return (num%10) + sum(num/10);
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(789));

	}

}
