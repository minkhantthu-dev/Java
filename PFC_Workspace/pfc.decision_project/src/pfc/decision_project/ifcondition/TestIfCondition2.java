package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestIfCondition2 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please type a number between (1-7): ");
		n=sc.nextInt();
		if(n==1) System.out.println("Mon");
		else if(n==2) System.out.println("Tue");
		else if(n==3) System.out.println("Wed");
		else if(n==4) System.out.println("Thu");
		else if(n==5) System.out.println("Fri");
		else if(n==6) System.out.println("Sat");
		else if(n==7) System.out.println("Sun");
		else System.out.println("Your number is not from 1 to 7");
	}

}
