package pfc.repetition_project.nested;

public class Ladder {

	public static void main(String[] args) {
		int steps=3, stepHeight=3, eachStepWidth=5;
		for (int s=1; s<=steps; s++) {
			for(int h=1; h<=stepHeight;h++) {
				for (int star=1; star<=s*eachStepWidth; star++) {
					if (h==1 || h== stepHeight) System.out.print("*");
					else {
						if (star==1 ||  star==s*eachStepWidth) System.out.print("*");
						else System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

}
