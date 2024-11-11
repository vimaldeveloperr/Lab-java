package interview;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping a =:"+a+"  b ="+b);
		//using swapping two numbers
		
		int c=100;
		int d=200;
		
		c=c+d;
		d=c-d;
		c=c-d;
		
		c=c^d;
		d=c^d;
		c=c^d;
		
		System.out.println("After Swapping c =:"+c+"  d ="+d);
	}

}
