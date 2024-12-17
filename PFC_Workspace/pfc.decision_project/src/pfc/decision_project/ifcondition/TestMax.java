package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestMax {

	public static void main(String[] args) {
		int n1, n2, n3, max=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number: ");
		n1 =sc.nextInt();
		System.out.print("Enter Second number: ");
		n2 =sc.nextInt();
		System.out.print("Enter Third number: ");
		n3 =sc.nextInt();
		//if (n1>n2 && n1>n3) max=n1;
		//if (n2>n1 && n2>n3) max=n2;
		//if (n3>n1 && n3>n2) max=n3;
		max = n1;
		if (n2>max) max=n2;
		if (n3>max) max=n3;
		System.out.print("Maximum is "+ max);
	}

}
