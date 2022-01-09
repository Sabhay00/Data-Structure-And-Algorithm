package _100DaysOfCode;
import java.util.*;
public class obligations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int obli = sc.nextInt();
		int reduce = sc.nextInt();
		int days = 0;
		
		int[] res = new int[obli];
		
		for(int i = 0 ; i<obli;i++) {
			res[i] =sc.nextInt();
		}
		
		Arrays.sort(res);
	  if(reduce>obli) {
		  System.out.print(total);
	  }
	  else {
		  days = res[reduce] -1;
	  }
	  
	  days = Math.max(days,total-res[obli-1-reduce]);
	  System.out.println(days);
	}
}
