package interview;

public class Duplicate {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,3,5,5,6,9,7};
		for(int i=1;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&(i!=j)) {
					System.out.println("Duplicates:"+a[j]);
				}
			}
		}

	}

}
