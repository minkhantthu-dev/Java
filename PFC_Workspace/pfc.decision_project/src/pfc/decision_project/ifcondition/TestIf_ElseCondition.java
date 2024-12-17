package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestIf_ElseCondition {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please type a number: ");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		System.out.print("End Program");
	}

}
