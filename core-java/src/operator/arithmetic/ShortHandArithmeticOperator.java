package operator.arithmetic;

public class ShortHandArithmeticOperator {

	public static void main(String[] args){
		
		int a = 10;
		a = a + 20; 
		// a +=20;
		System.out.println(a); //30

		int b = 10;
		b +=20; 
		// b = b + 20;
		System.out.println(b); //30


		int c = 10;
		c *=10; // c = c * 10;
		System.out.println(c); //100
		

		int d = 10;
		d /=2; // d = d / 2;
		System.out.println(d); //5
		

	}	

	
}