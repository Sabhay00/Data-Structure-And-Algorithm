 package Bitwise;

public class largestConsecutive1s {
	
	public static int max(int N) {
	int temp = 1;
      int count = 0;
      int countStore = 0;
    
   while(temp<=N){
       if((N&temp)!=0){
           count++;
      }
    else{
           if(count>countStore){
               countStore=count;
       }
           count = 0;
       } 
       System.out.println(count);
       temp = temp << 1;
   }
      
      return Math.max(count, countStore);
      // Your code here
      
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(3));
		

	}

}
