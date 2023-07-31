public class PureLogicalOperator4 {

	public static void main(String[] args){
		int number = 2020;
		System.out.println( number%400==0);//false 
		System.out.println( number%100!=0);//true
		System.out.println( number%4==0);//true		
		
		System.out.println( (number%4==0) || (number%100!=0) && (number%4==0) );//true		
		
		
		// to check if number is a leap year or not
		System.out.println( 
					(number%4==0) || 
						( (number%100!=0) && (number%4==0)) 
				
				);//true		
	
	
		

	}	
}