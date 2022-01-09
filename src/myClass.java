import java.util.*;
public class myClass {
public static void fun(int total,int comp,int[] arr) {
	int[] tobe = new int[total-comp];
	
	Arrays.sort(arr);
	
	for(int i =1; i <=total ;i++ ) {
		boolean flag = true;
		for(int j = 0 ; j < arr.length; j++) 
		{
			if(arr[j]==i){
				flag =false;
			}
			
			
		}
		if(flag ==true) {
			tobe[i] =i;
		}
	
	}
	Arrays.sort(tobe);
	System.out.print(tobe);
	
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int comp = sc.nextInt();
		int[] arr = new int[comp];
		for(int i =0 ; i < comp;i++) {
			arr[i] = sc.nextInt();
		}
fun(total,comp,arr);		

	}

}
