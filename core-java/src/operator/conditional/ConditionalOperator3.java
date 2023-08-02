package operator.conditional;

public class ConditionalOperator3 {

	public static void main(String[] args){
	
			int number = 51;
			
			System.out.println(
			
				number%5 == 0
				? number+" is divisible by 5"
				: number+" is not divisible by 5"
			
			);

	}	
}