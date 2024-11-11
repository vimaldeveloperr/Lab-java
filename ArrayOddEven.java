package interview;
import java.util.Scanner;

public class ArrayOddEven {

	public static void main(String[] args) {
		int e=0,o=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit");
		int  n =sc.nextInt();
		int arr[]=new int[n];
		System.out.print(" enter the numbers");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}
		for (int elements:arr) {
			if(elements%2==0) {
				System.out.println( "the even nus are "+elements);
				
				e++;
			}
			else {
				System.out.println("the odd nus are "+elements);
				o++;
			}
		}
		System.out.println(e);
		System.out.println(o);

	}

}
