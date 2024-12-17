package pfc.methods.parameter;

public class Test_void_MethodWithParameter {
	
	public static void display(char ch) {
		System.out.print(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		display('$');
		display('&');
		
		char mychar = '*';
		display(mychar);
		
		
		System.out.println();
		
		System.out.println("End Main");

	}

}
