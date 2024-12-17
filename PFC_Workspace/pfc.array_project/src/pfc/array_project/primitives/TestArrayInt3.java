package pfc.array_project.primitives;

public class TestArrayInt3 {

	public static void main(String[] args) {
		int[]numbers=new int[5];
		numbers[0]=500;
		numbers[1]=80;
		numbers[2]=0;
		numbers[3]=-90;
		numbers[4]=0;
		// int[]numbers= {500,80,0,-90,0};
		System.out.print("numbers[]=");
		for (int i=0; i<numbers.length;i++) {
		System.out.print(numbers[i]+" ");
		}
	}

}
