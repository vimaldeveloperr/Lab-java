package interview;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,4,4,5,6};
		int j=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=j) {
				for(int j1=i+1;j1<a.length;j1++) {
					if(a[i]==a[j1] ){
						a[j1]=j;
						
					}
				}
				System.out.print(a[i]);
			}
		}
	}

}
