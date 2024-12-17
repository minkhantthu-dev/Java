package pfc.repetition_project.forloop;

import java.util.Scanner;

public class HelloEcho {
	public static void main(String[] args) {
		String name;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.print("Hi, What's your name : ");
		name=sc.nextLine();
		System.out.print("How many time you’d like to say hello ? : ");
		count=sc.nextInt();
		
		for ( int i=1; i<=count; i++) {
			System.out.println("Hello "+ name);
		}
		System.out.println ("Well "+name+", Have a good day");
	}
}
