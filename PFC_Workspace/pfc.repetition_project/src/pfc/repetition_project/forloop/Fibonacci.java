package pfc.repetition_project.forloop;

public class Fibonacci {

		    public static void main(String[] args) {
		        int a = 0, b = 1, temp;

		        for (int i = 0; i < 10; i++) {
		            System.out.print("F" + i + " : " + a);
		           temp = a + b;
		            a = b;
		            b = temp;
		            System.out.println("");
		        }
		    }
			
	}

