package pfc.operator_project.bitwises;

public class TestBinary {

	//operand value can be boolean (true,false), numbers (integer)
	
	public static void main(String[] args) {
		
			System.out.println("----And (&)-----");
			System.out.println(true & true);
			System.out.println(true & false);
			System.out.println(false & true);
			System.out.println(false & false);
			System.out.println(100 & 200);
			
			
			System.out.println("----Or (|)-----");
			System.out.println(true | true);
			System.out.println(true | false);
			System.out.println(false | true);
			System.out.println(false | false);
			System.out.println(100 | 200);
			

	}

}
