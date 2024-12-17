package pfc.array_project.string_types;

import java.util.Scanner;

public class TestStringArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of names: ");
		int size=sc.nextInt();
		
		String[] names=new String[size];
		sc=new Scanner(System.in);
		for (int i=0;i<size;i++) {
			System.out.print("Enter ");
			if(i==0) System.out.print("1st name: ");
			else if(i==1) System.out.print("2nd name: ");
			else if(i==2) System.out.print("3rd name: ");
			else System.out.print((i+1)+"th name: ");
			names[i]=sc.nextLine();
		}
		
		System.out.println("names: ");
		for (int i=0;i<size;i++) {
			System.out.println(names[i]); }
		sc.close();

	}

}
