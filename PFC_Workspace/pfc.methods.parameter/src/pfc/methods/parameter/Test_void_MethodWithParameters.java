package pfc.methods.parameter;

public class Test_void_MethodWithParameters {

	public static void display(char ch,int count,int line) {
		for(int l=1; l<=line; l++) {
			for(int i=1; i<=count; i++) {
				System.out.println(ch);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		display('$',3,2);
		display('&',2,5);
		
		char mychar = '*';
		display(mychar,2,6);
		
		System.out.println();
		
		System.out.println("End Main");

	}

}
