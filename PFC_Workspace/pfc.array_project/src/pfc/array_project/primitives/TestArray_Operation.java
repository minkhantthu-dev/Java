package pfc.array_project.primitives;

public class TestArray_Operation {

	public static void main(String[] args) {
		 int[]numbers= {500,80,0,-90,2}; //input
		 int max,min,sum=0;
		 double avg;
		 max=min=numbers[0];
		 //output 
		 System.out.print("numbers[]=");
			for (int i=0; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
				if (numbers[i] > max) max=numbers[i]; 
				if (numbers[i] < min) min=numbers[i]; 
			sum+=numbers[i]; //sum=0 must
			
			}
			avg= (double)sum/numbers.length;
			
			System.out.println();
			System.out.println("Max= "+max);
			System.out.println("Min= "+min);
			System.out.println("Sum= "+sum);
			System.out.println("Avg= "+avg);
            
     

	}

}
