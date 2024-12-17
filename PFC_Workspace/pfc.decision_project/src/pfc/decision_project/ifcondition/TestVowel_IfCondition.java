package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestVowel_IfCondition {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character between (a-z): ");
		ch=sc.next().charAt(0);
		if (ch=='a') System.out.print("This charcter is a vowel.");
		else if (ch=='e') System.out.print("This charcter is a vowel.");
		else if (ch=='i') System.out.print("This charcter is a vowel.");
		else if (ch=='o') System.out.print("This charcter is a vowel.");
		else if (ch=='u') System.out.print("This charcter is a vowel.");
		else System.out.print("This charcter is not a vowel.");
		
	}

}
