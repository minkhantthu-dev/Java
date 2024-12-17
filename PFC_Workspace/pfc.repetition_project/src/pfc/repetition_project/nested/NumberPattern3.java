package pfc.repetition_project.nested;

public class NumberPattern3 {

	public static void main(String[] args) {
		for(int l=1;l<=5;l++) {
			for (int s=1;s<=5-l;s++) {
				System.out.print(" ");
			}
			for(int n=1;n<=l;n++) {
			System.out.print(l);
		}
		System.out.println();
		}

	}

}
