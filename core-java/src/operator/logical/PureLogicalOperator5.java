package operator.logical;

public class PureLogicalOperator5 {

	public static void main(String[] args){
		
		// short-circuit &&
		System.out.println(10%2==1 && 10/0==0);// false
		
		// short-circuit ||
		System.out.println(10%2==0 || 10/0==0);// true
		
		
		// short-circuit &&
		System.out.println(10/0==0 && 10%2==1  );// Exception 
		

	}	
}