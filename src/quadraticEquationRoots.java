import java.util.ArrayList;
import java.util.Scanner;

public class quadraticEquationRoots {

	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		ArrayList ar = new ArrayList(2);
		int temp = (b * b) - (4 * a * c);
		if (temp > 0 || temp == 0) {
			temp = (int) Math.sqrt(temp);
			Integer temp1 = -(b + temp);
			Integer temp2 = temp - b;
			temp1 =(int) Math.floor( temp1 / (2 * a));
			temp2 = (int) Math.floor(temp2 / (2 * a));
			System.out.println(temp1);
			System.out.println(temp2);
			if (temp1 > temp2) {
				ar.add(temp1);
				ar.add(temp2);
			} else {
				ar.add(temp2);
				ar.add(temp1);
			}
		}
		return ar;
	}

	public static void main(String[] args) {
		System.out.println(quadraticRoots(752, 904, 164));
		/*
		 * double secondRoot = 0, firstRoot = 0; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the value of a ::"); double a = sc.nextDouble();
		 * 
		 * System.out.println("Enter the value of b ::"); double b = sc.nextDouble();
		 * 
		 * System.out.println("Enter the value of c ::"); double c = sc.nextDouble();
		 * 
		 * double determinant = (b*b)-(4*a*c); double sqrt = Math.sqrt(determinant);
		 * 
		 * if(determinant>0){ firstRoot = (-b + sqrt)/(2*a); secondRoot = (-b -
		 * sqrt)/(2*a); System.out.println("Roots are :: "+ firstRoot
		 * +" and "+secondRoot); }else if(determinant == 0){
		 * System.out.println("Root is :: "+(-b + sqrt)/(2*a)); } }
		 */
	}
}
