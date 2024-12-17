import java.util.Scanner;
public class Examiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of students: ");
		int size = s.nextInt();
		
		String[]names = new String[size];
		char[]gender = new char[size];
		int[]mm_marks = new int[size];
		int[]ma_marks = new int[size];
		int[]e_marks = new int[size];
		int[]total_marks = new int[size];
		int highestmark = total_marks[0];
		int highest
		double totalmarks = 0, tmm_marks = 0,tm_marks=0, te_marks = 0;
		for(int i=0; i<size; i++) {
			System.out.print("Enter student name: ");names[i] = s.nextLine();
			System.out.print("Enter gender (m/f): ");gender[i] = s.next().charAt(0);
			System.out.print("Enter Myanmar mark: ");mm_marks[i] = s.nextInt();
			System.out.print("Enter English mark: ");e_marks[i] = s.nextInt();
			System.out.print("Enter Mathmetic mark: ");ma_marks[i] = s.nextInt();
			System.out.print("Enter Total mark: ");total_marks[i] = s.nextInt();
			total_marks[i] = mm_marks[i]+ma_marks[i]+e_marks[i];
			System.out.println("Total mark: of "+names[i]+"\t:"+total_marks[i]);
			if(mm_marks[i]>=40 && ma_marks[i]>=40 && e_marks[i]>=40)
				System.out.println("Pass");
			else System.out.println("Fail");
			
			tmm_marks+=mm_marks[i];
			tm_marks+=ma_marks[i];
			te_marks += e_marks[i];
			if(total_marks[i]>highestmark) {
				highestmark=total_marks[i];
				//highestIndex = i;
			}
		}
		System.out.println("Average marks (All subject)\t: "+totalmarks/size);
		System.out.println("Average Myanmar marks (All subject)\t: "+tmm_marks/size);
		System.out.println("Average English marks (All subject)\t: "+te_marks/size);
		System.out.println("Average Mathematic marks (All subject)\t: "+tm_marks/size);
		//System.out.println(names[highestIndex]+"got highest Marks with/t:"+highestmark);
		System.out.println("Name\t\tGender Myanmar  English  Math\t total \t p/F");
		System.out.println("====\t\t===== ===== ===== ===== ===== \t ====== \t ===");
		
		for(int i=0;i<size; i++) {
			System.out.print(names[i]+"\t\t"+gender[i]+" "+mm_marks[i]+" "+ma_marks[i]+" "+ e_marks[i]+"\t"+total_marks[i]+"\t");
			if(mm_marks[i]>=40 && ma_marks[i]>=40 && e_marks[i]>=40)
				System.out.println("Pass");
			else System.out.println("Fail");
		}
	}

}
