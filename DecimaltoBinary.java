package interview;
import java.util.Scanner;
class DecimaltoBinary {
	public static void D2B(int n) {
		int []arr=new int[1000];
		int i=0;
		while(n>0) {
			 arr[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		System.out.print(arr[j]);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int n=sc.nextInt();
		
		System.out.println("decimal no "+n);
		System.out.print("binary number  ");
		D2B(n);
		
 
	}

}
