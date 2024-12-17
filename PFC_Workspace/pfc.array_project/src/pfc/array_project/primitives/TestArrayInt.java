package pfc.array_project.primitives;

public class TestArrayInt {

	public static void main(String[] args) {

		int[]numbers=new int[10];
		numbers[0]=500;
		for (int i=0; i<10;i++) {
		System.out.println("numbers["+i+"] = "+numbers[i]);
		}
//		System.out.println("numbers[10] = "+numbers[10]); (arrayoutofbound runtime error)
	}
	}
