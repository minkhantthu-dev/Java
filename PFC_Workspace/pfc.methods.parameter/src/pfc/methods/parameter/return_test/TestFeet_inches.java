package pfc.methods.parameter.return_test;

public class TestFeet_inches {
	
	public static double convertToInches(int feet,double inches) {
		double result = feet*12+inches;
		return result;  
	}
	
	public static Distance convertToFeet_Inches(double totalinches) {
		Distance d= new Distance();
		d.feet = (int)totalinches/12;
		d.inches = totalinches-(d.feet*12);
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		
		int f=10; double i=10.5;
		System.out.println("Total Inches: "+ convertToInches(f,i));
		
		double totalinches = 128.5;
		Distance result = convertToFeet_Inches(totalinches);
		System.out.println("Feet: "+ result.feet);
		System.out.println("Inches: "+ result.inches);
		}

}
