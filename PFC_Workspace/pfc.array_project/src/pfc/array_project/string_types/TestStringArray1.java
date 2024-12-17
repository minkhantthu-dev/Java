package pfc.array_project.string_types;

import java.util.Scanner;

public class TestStringArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
	
		for (int i=0;i<names.length;i++) {
		System.out.print("Enter name: ");
		names[i]=sc.next(); }
	
		System.out.print("names: ");
		
		for (int i=0;i<names.length;i++) {
			System.out.print(names[i]); }
		sc.close();
		
	
		
		

	}

}
