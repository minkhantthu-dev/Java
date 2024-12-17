package pfc.operator_project.arithmetic;

public class TestUnary {
	public static void main(String[] args) {
		int n=7;
		//n++; //post increment
		//++n; //pre increment
		//System.out.println(n);
		int r;
		//r=++n;
		r=n++;
		System.out.println("n= "+n);
		r=++n;
		int b1=100, b2=100;
		System.out.println("b1= "+b1++);
		System.out.println("b1= "+b1);
		System.out.println("b2= "+ ++b2);
	}
}
