package pfc.decision_project.switchcondition;

import java.util.Scanner;

public class TestSwitchCondition2 {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character between (a-z): ");
		ch=sc.next().charAt(0);
		switch (ch) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': System.out.print("This charcter is a vowel."); break;
		default: System.out.print("This charcter is a consonant."); break;
		}
		
	}

}
