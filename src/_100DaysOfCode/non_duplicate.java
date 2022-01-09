package _100DaysOfCode;


public class non_duplicate {
	
	static int unique(String s) {
		
		int len = s.length();
		boolean flag = true;
		for(int i =0; i<len; i++) {
			char ch = s.charAt(i);
			if(s.indexOf(ch)==s.lastIndexOf(ch))
				return i+1;
			
}
		return -1;
		
	}
	
	public static void main(String[] args) {
	String s = "aabbcc";
	System.out.println(unique(s));

	}

}
