public class IncrementDecrement2 {

	public static void main(String[] args){
		int a = 5;
		int b = 5;
		
		System.out.println(a++ + --b + ++a + b++ + a); //27
		System.out.println(a++ + --b + ++a + b++ + a); //33
		

	}	
}