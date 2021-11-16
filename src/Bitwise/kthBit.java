package Bitwise;

public class kthBit {
	//left_shift_method
	/*static void kthBit(int n,int k) {
		if((n & (1<<(k-1)))!=0){
			System.out.println("yes");
		}
		else System.out.println("No");
	}*/
	
	//right_shift_method
	static void kthBit(int n,int k) {
		if(((n>>(k-1)) & 1)==1) {
			System.out.println("yes");
		}
		else {
		System.out.println("No");	}
	}
	
	
	public static void main(String[] args) {
		kthBit(5,3);

	}

}
