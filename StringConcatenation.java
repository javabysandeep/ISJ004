public class StringConcatenation {

	public static void main(String[] args){
		
		System.out.println('A'); //A
		System.out.println('A'+"A"+'A');//AAA
		System.out.println('A'+'A'+"A");//130A
		System.out.println("A"+'A'+'A');//AAA

		System.out.println(10+20+'A'+"A"+10);//95A10
		System.out.println("A"+('A'+'A'));//A130

	}	
}