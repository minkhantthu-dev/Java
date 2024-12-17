package pfc.decision_project.switchcondition;

import java.util.Scanner;

public class TestSwitchCondition {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number between (1-7): ");
		n=sc.nextInt();
		switch (n) {
		case 1: System.out.println("Mon"); break;
		case 2: System.out.println("Tue"); break;
		case 3: System.out.println("Wed"); break;
		case 4: System.out.println("Thu"); break;
		case 5: System.out.println("Fri"); break;
		case 6: System.out.println("Sat"); break;
		case 7: System.out.println("Sun"); break;
		default: System.out.println("Your number is not from 1 t0 7"); break;
		}
	}

}
