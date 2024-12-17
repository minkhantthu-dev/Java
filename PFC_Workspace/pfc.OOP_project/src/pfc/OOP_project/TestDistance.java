package pfc.OOP_project;
import 
public class TestDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n1,n2;
		//n1 = 7;
		//System.out.println("n1:"+n1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Total Inches: ");
		double totalInches = sc.nextDouble();
		
		Distance d1 = new Distance(totalInches);
		d1.display();
		//Distance d2 = new Distance(7,8.5);
		//Distance d3 = new Distance();
		
		//Distance d4 = new Distance();
		
		
		d4.setFeet(7);
		System.out.println("d4.feet:"+d4.getFeet());
		
		//d1.feet = 5;
		//d1.inches = 3.5;
		//System.out.println("d1: "+ d1.feet+"\'"+d1.inches+"\'"); 
		
		
		//d2.feet = 9;
		//d2.inches = 8.5;
		//System.out.println("d2: "+ d2.feet+"\'"+d2.inches+"\'");
		//d2.display();
		
		//d3.display();
		
		//d4.setFeet(7);
		//System.out.println("d4.feet: "+d4.getFeet());
	}

}
