package pfc.decision_project.switchcondition;

import java.util.Scanner;

public class TestCheckID {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int fee;
		String id;
		System.out.print("Enter Course Fee: ");
		fee=sc.nextInt();
		System.out.print("Enter ID no: ");
		id=sc.next();
		
		switch(id) {
		case "01": System.out.print("Total Course fee: "+ (fee-fee*0.1)); break;
		case "02": System.out.print("Total Course fee: "+ (fee-fee*0.2)); break;
		case "03": System.out.print("Total Course fee: "+ fee); break;
		default: System.out.print("This input is not AI's ID no."); break;
		}

	}

}
