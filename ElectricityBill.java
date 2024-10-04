package lab1;
import java.util.Scanner;


public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Electricity Units");
		int units=sc.nextInt();		
		
		double billAmount=0;
		if (units<=100)
		{
			billAmount=units*1.5;
		}
		else if (units<=200)
		{
			billAmount=(100*1.5)+(units-100)*2.5;
		}
		else if(units<=300)
		{
			billAmount=100*1.5+100*2.5+(units-200)*4;
		}
		else
			billAmount=100*1.5+100*2.5+100*3+(units-300)*6;
		
		System.out.println("The total Electricity Bill is :"+billAmount);

	}

}
