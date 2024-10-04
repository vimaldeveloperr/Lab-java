package lab1;
import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entre the principal(p):");
		double principal= sc.nextDouble();
		System.out.println("Enter the rate(r):");
		double rate=sc.nextDouble();
		System.out.println("Enter the time periods(t):");
		double time=sc.nextDouble();
		
		double SimpleIntrest=(principal*rate*time)/100;
		System.out.println("The simple Intrest is "+SimpleIntrest);
		

	}

}
