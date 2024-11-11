package interview;
import java.util.Arrays;
public class InsertElementArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int index =2;
		int value=55;
		System.out.println("before insert"+Arrays.toString(a));
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=value;
		System.out.println(Arrays.toString(a));
		
	

	}

}
