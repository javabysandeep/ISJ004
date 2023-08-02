package operator.arithmetic;

public class ArithmeticOperators1 {

	public static void main(String[] args){
		
		byte b1 = 10;
		byte b2 = 20;
		int b3 = b1 + b2;

		System.out.println(b3);
		System.out.println('A' + 'A');
		System.out.println('A' + 'A' + 10);
		System.out.println('A' + 10.0 + 10);
		System.out.println('A'/ 13);//Q = 5
		System.out.println('A'% 12); // R= 5
		System.out.println(10/1); // Q =10 
		System.out.println(1/10); // Q = 0

		System.out.println(10.0/0); // Infinity
		System.out.println(10.0 % 0); //  NaN
		System.out.println(10 / 0); //ArithmeticException
	

	}
}