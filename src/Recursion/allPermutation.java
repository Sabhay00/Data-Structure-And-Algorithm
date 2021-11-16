package Recursion;



public class allPermutation {
	static void per(String S ,int i) {
		if(i==S.length()-1) {
			System.out.println(S); 
			return ;
		}
		for(int j = i;j < S.length() ;j++) {
			//Collections.swap(null, S.charAt(i),S.charAt(j));     this part is wrong and have to be modified.
			per(S,i+1);
			//Collections.swap(null, S.charAt(i),S.charAt(j));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      per("ABC" , 0);
	}

}
