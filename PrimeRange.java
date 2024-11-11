package interview;

public class PrimeRange {


	public static void main(String[] args) {
		/*int sum=0;
		int count=0;
		
		for(int i=2;i<=10;i++) {
			if (isPrime(i)) {
				sum +=i;
				count+=1;
				System.out.println( " the sum is "+i);
				
							}}
		System.out.println(count);
		System.out.println(sum);*/
		int terem =5;
		int count=0,num=2;
		while (count<terem)
		{
			if (isPrime(num)) {
						System.out.print(num+",");
						count++;

		}
			num++;

	}
	}
				
		
		public static boolean isPrime(int n) {
			if(n<2) {
				return false;
			}
			for(int i=2;i<=n/2;i++) {
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
			


		
		

	}}