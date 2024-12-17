package pfc.variable_datatype;

public class TestShortVariable {

	public static void main(String[] args) {
		short shortNum;
		shortNum=32767;
		//Range: -32768 to 32767
		shortNum=(short)(shortNum+1); //type cast 
		//arithmetic operation return=integer
		System.out.print("short variable: ");
		System.out.print(shortNum);

	}

}
