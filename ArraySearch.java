package interview;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("entre the array size");
		int size=sc.nextInt();
		System.out.println("Enter the elements");
		int [] a=new int[size];
		for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println("enter the searchelement");
		int searchElement=sc.nextInt();
		 boolean found=false;
		 for (int i=0;i<a.length;i++) {
		 if (searchElement==a[i]) {
			 System.out.println(Arrays.toString(a)+"elemnet "+searchElement+"index of "+i);
			 found =true;
			 return;
			 
		 }
		 }
		 if(!found) 
		 {
			 System.out.println("element not found");
		 }
		
		
		
		
	}

}
