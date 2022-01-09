package _100DaysOfCode;
import java.util.*;

public class shifting_cards {
	
	static int minDis(int size,String[] card,int ind,String tg) {
		ArrayList<String> cards = new ArrayList<>();
		Collections.addAll(cards,card);
		int end = cards.indexOf(tg);
		int min = 0;
		
		if(Math.abs(end-ind)==1) {
			return 1;
			
		}
		if(end==ind) {
			return 0;
		}
		
		if(end>ind) {
			int forward = end-ind;
			int backward = ind+(size-1-end)+1;
			min = Math.min(forward, backward);
			
		}
		else {
			int backward = ind-end;
			int forward = end+(size-1-ind)+1;
			min = Math.min(forward, backward);
		}
		
		return min;
	}
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       String[] cards = new String[size];
       for(int i = 0 ; i < size ; i++) {
    	   cards[i] = sc.next();
       }

       int index = sc.nextInt();
        String target = sc.next();
        System.out.println(minDis(size,cards,index,target));
        
	}

}


























