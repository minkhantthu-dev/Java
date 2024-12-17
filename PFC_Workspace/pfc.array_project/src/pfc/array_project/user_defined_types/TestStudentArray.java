package pfc.array_project.user_defined_types;

public class TestStudentArray {

	public static void main(String[] args) {
		//Student[] stus=new Student[5];
		Student[] stus= {
				new Student(1,"A",20),
				new Student(2,"B",19),
				new Student(3,"C",18),
				new Student(4,"D",26),
				new Student(5,"E",20),
		};
		stus[3]=new Student(100,"T",23);
//		Student s=new Student(10,"N",27);
//		stus[0]=s;
		
		for (int i=0; i<stus.length;i++) {
		System.out.println(stus[i]);
		}
				
	}

}
