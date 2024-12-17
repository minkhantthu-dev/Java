package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestIf_IfElse_ElseCondition {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please type a number: ");
		n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive number");
		} else if(n<0) {
			System.out.println("Negative number");
		} else {
			System.out.println("Zero");
		}
		System.out.print("End Program");
	}
	
}
