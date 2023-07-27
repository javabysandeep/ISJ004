public class ComparisionOperator2 {

	public static void main(String[] args){
		int a = 100;
		
		System.out.println(a > 5); //true
		
		//10>5 will result into true which we try to assign a.
		//a is integer type so we cant assign boolean value
		//System.out.println(a=10 > 5); //CTE
		
		System.out.println(10 < (a=5)); //false
		
		
		
		

	}	
}