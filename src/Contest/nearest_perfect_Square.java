package Contest;

import java.util.Scanner;

public class nearest_perfect_Square {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
		     
		     int testCase = sc.nextInt();
		     for(int i = 0; i < testCase; i++){
		         int X = sc.nextInt();
		         System.out.println(perfect(X));
		     }
	}

    static int perfect(int X){
        int root = SqRoot(X);
        if(root*root != X){
        if((X-(root*root))<((root+1)*(root+1)-X)){
        return root*root;}
        else{
            return (root+1)*(root+1);
        }
        }
        else{
            if((X-((root-1)*(root-1)))<((root+1)*(root+1)-X)){
        return (root-1)*(root-1);}
        else{
            return (root+1)*(root+1);
        }
        }
   }
    static int SqRoot(int X){
        int i=1;
        int Root = 0;
        while((i*i) <= X){
            Root = i;
            i++;
        }
        return Root;
    }
}
