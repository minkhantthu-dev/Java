package pfc.repetition_project.nested;

import java.util.Random;
import java.util.Scanner;

public class GuessGame_Lv1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int rno=rand.nextInt(5);
		int gno;
		System.out.println("Guess Game(0 to 5) Started!!!");
		System.out.print("Guess my number is ");
		gno=sc.nextInt();
		while(gno!=rno) {
			System.out.println("No !! You got it wrong ");
			System.out.print("Guess again ");
			gno=sc.nextInt();
		}
		System.out.println("Wow!!! You got it right");
		System.out.println("Game Ended");
	}

}
