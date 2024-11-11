package interview;

public class B2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int binary=1100;
int power=0,decimal=0;
{
	while (binary>0) {
		int rem=binary%10;
		decimal+=rem*Math.pow(2, power);
		binary=binary/10;
		power++;
		
		
	}
	System.out.println( "the decimal number is "+decimal);
}
	}

}
