public class PureLogicalOperator {

	public static void main(String[] args){
		
		System.out.println("Logical AND Operator : &&"); 
		System.out.println(true && true); //true
		System.out.println(false && false); //false
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		
		System.out.println("Logical OR Operator : ||"); 
		System.out.println(true || true); //true
		System.out.println(false || false); //false
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		
		System.out.println("Logical NOT Operator : !"); 
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		//System.out.println(true || 20);//CTE
		//System.out.println(true && 20);//CTE
		//System.out.println(10 && 20);//CTE
		//System.out.println(!10); //CTE:  error: bad operand type int for unary operator '!'
		

	}	
}