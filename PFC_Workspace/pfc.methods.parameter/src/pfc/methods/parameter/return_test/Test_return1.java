package pfc.methods.parameter.return_test;

public class Test_return1 {
	
	public static int adder(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
		//return n1+n2; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		int calculate = adder(5,2);
		System.out.println("Result: "+calculate);
		System.out.println("Next Result: "+adder(8,8));
		System.out.println("End");

	}

}
