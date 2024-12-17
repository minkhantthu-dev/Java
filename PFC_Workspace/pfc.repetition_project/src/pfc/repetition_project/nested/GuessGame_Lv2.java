package pfc.repetition_project.nested;

import java.util.Random;
import java.util.Scanner;

public class GuessGame_Lv2 {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random rand=new Random();
			int rno=rand.nextInt(21);
			int gno;
			System.out.println("Guess Game(0 to 20) Started!!!");
			System.out.print("Guess my number is ");
			gno=sc.nextInt();
			if (gno>20 ) System.out.println("Read the game info idiot, guess the number between 0 and 20.");
			else if (gno!=rno) {
				System.out.print("No !! You got it wrong ");
				if (gno-rno==5 || rno-gno==5) System.out.println("Your number is close to my number.");
				else System.out.println("Your number is too far from my number."); 
				System.out.print("Guess again ");
				gno=sc.nextInt(); }
		
				
				System.out.println("Wow!!! You got it right");
				System.out.println("Game Ended"); }
			
			
		}
