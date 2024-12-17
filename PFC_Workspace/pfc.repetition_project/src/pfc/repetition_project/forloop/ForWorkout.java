package pfc.repetition_project.forloop;

public class ForWorkout {

	public static void main(String[] args) {
		// 5 4 3 2 1 0 -1 -2 -3 -4 -5
		for ( int i=5; i>=-5; i--) {
			System.out.print (i+ " ");
		}
		System.out.println();
		// 1*4*9*16*25
		for ( int i=1; i<=5; i++) {
			System.out.print (i*i+"*");
		}
	}

}
