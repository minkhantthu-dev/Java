package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		n=sc.nextInt();
		if(n>40) {
			System.out.println("You are getting mature.");
		} else {
			System.out.println("You are not yet mature.");
		    }

	}
}

