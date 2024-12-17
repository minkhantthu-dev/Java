package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestPass_Fail {

	public static void main(String[] args) {
		int my_mark, e_mark, m_mark;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Myanmar mark: ");
		my_mark=sc.nextInt();
		System.out.print("Enter English mark: ");
		e_mark=sc.nextInt();
		System.out.print("Enter Math mark: ");
		m_mark=sc.nextInt();
		if (my_mark>=40 && e_mark>=40 && m_mark>=40) System.out.print("Pass");
		else System.out.print("Fail");
	}

}
