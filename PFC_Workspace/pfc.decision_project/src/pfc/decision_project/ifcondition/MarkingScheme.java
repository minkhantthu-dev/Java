package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class MarkingScheme {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your mark: ");
		n=sc.nextInt();
		if(n<60) {
			System.out.println("You got grade D");
		} else if(n<80) {
			System.out.println("You got grade C");
		} else if(n<90) {
			System.out.println("You got grade B");
		} else if(n<95) {
			System.out.println("You got grade A");
		} else {
			System.out.println("You got grade A+");
		}
			
	}
}

