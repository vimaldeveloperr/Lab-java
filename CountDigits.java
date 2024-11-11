package interview;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		long num=sc.nextLong();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("count:"+count);
		Scanner scanner= new Scanner (System.in);
		System.out.println("ntr word");
		String word=scanner.nextLine();
		int cunt=word.length();
		System.out.println("No of words is "+cunt);
		

	}

}
