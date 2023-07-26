public class AssignmentOperator {

	public static void main(String[] args){
		
		int a = 100;
		int b = a ;
		int c = 10 * 20 ;
		int d = add(100,200);

		System.out.println(a); //100
		System.out.println(b); // 100
		System.out.println(c); // 200
		System.out.println(d); // 300
		System.out.println(a=1000); //1000
		//System.out.println(100=100);//CTE
		

	}	

	public static int add(int number1, int number2){

		return number1 + number2;
	}
}