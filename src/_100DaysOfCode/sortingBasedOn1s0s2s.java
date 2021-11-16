package _100DaysOfCode;

public class sortingBasedOn1s0s2s {
	static void sort(int a[],int n) {
		for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                } 
            }
        } 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
