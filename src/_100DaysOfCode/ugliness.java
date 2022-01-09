package _100DaysOfCode;

import java.util.ArrayList;
import java.util.Scanner;

public class ugliness {
	
	public static void minimize(String s,int cash,int swap,int flip) {
	
		char[] ar = new char[s.length()];
		
		for(int i =0 ;i < s.length();i++) {
			ar[i] =s.charAt(i);
			
		}
		for(int i = 0 ; i < s.length() ; i++ ) {
			if(ar[i]=='1') {
				 if(cash>=flip) {
					 ar[i]='0';
					 cash -= flip;
					 break;
				 }
				 if(cash>=swap) {
					 
				 }
			}
		}
		
		System.out.print(ar);
		

	}

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
     

	}

}
