package pfc.repetition_project.forloop;

import java.util.Scanner;

public class Workout2 {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		for ( int i=1; i<=12; i++) {
			System.out.println (i+"*"+n+"="+(i*n));		}
	}

}
