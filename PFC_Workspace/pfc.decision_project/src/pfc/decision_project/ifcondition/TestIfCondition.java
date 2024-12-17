package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestIfCondition {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please type a number: ");
		n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive number");
		}
		System.out.print("End Program");

	}

}
