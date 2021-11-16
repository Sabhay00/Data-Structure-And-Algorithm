package Bitwise;

public class bitDifference {
public static int countBitsFlip(int a, int b){
        
        int res = a^b;
        int count = 0;
        while(res!=0)
        {
        	count++;
           res = res & (res-1);
        }
        
        return count;
    }

public static void main(String []Args) {
	System.out.println(countBitsFlip(20,25));
}
}