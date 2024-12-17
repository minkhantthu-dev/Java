package pfc.decision_project.ifcondition;

import java.util.Scanner;

public class TestGyrometer {

	public static void main(String[] args) {
		int ax,ay,bx,by;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter x value for point A: ");
		ax =sc.nextInt();
		System.out.print("Enter y value for point A: ");
		ay =sc.nextInt();
		
		System.out.print("Enter x value for point B: ");
		bx =sc.nextInt();
		System.out.print("Enter y value for point B: ");
		by =sc.nextInt();
		
		if (ax==bx) {
			System.out.print("Vertical Line");
		} else if (ay==by) {
			System.out.print("Horizonal Line");
		} else {
				System.out.println("Diagonal Line");
				if (bx>ax) {
					System.out.print("Forward ");
					if (by>ay) System.out.println("Up");
					else System.out.println("Down");
				} else {System.out.print("Forward ");
				if (by>ay) System.out.println("Up");
				else System.out.println("Down");
					
				}
				}


	}

}
