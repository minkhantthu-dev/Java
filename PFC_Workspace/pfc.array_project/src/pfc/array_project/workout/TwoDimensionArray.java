package pfc.array_project.workout;

public class TwoDimensionArray {

	public static void main(String[] args) {
		//int [][] matrix = new int [4][3];
		int [][] matrix = {
				{100,20,30},
				{20,70,300},
				{700,90,80},
				{50,90,70}
		};
		for (int r=0;r<4;r++) {
		for (int c=0;c<3;c++) {
			System.out.print(matrix[r][c]+" ");
		}
		System.out.println();
		
		}
		

	}

}
