package pfc.repetition_project.nested;

public class StarPattern2 {
	
	public static void main(String[] args) {
        for (int l = 1; l <= 5; l++) {
            for (int s = 1; s < l; s++) {
                System.out.print(" ");
            }

            for(int n=5;n>=l;n--) {
            	System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
