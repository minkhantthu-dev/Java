package pfc.decision_project.switchcondition;

import java.util.Scanner;

public class TestCaculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n1,n2, operator;
		System.out.print("Enter First Number: ");
		n1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		n2=sc.nextInt();
		System.out.print("Enter Operator (1:+, 2:-, 3:*, 4:/): ");
		operator=sc.nextInt();
		
		switch (operator) {
		case 1: System.out.print("result: "+ (n1+n2)); break;
		case 2: System.out.print("result: "+ (n1-n2)); break;
		case 3: System.out.print("result: "+ (n1*n2)); break;
		case 4: System.out.print("result: "+ (n1/n2)); break;
		default: System.out.print("This input is not operator"); break;
		
		}
	}

}
