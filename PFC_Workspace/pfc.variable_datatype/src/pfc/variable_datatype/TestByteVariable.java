package pfc.variable_datatype;

public class TestByteVariable {

	public static void main(String[] args) {
		byte smallNum;
		smallNum=127;
		//Range: -128 to 127
		smallNum=(byte)(smallNum-1); //type cast 
		//arithmetic operation return=integer
		System.out.print("byte variable: ");
		System.out.print(smallNum);
		
	}

}
