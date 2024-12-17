package pfc.variable_datatype;

public class TestLongVariable {

	public static void main(String[] args) {
		long longNum;
		longNum=2147483647;
		longNum=longNum*longNum;
		//input numbers are took as int; can only input to the range of int
		//Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		longNum=longNum+1;  
		//don't need type casting
		System.out.print("long variable: ");
		System.out.print(longNum);

	}

}
