package pfc.userdefinedtype;

public class TestMyType {

	public static void main(String[] args) {
		Student s=new Student();
		s.rno=7;
		s.name="Aye Aye";
		s.address="Ygn";
		System.out.print("Student 1=");
		System.out.print(s.rno);
		System.out.print(s.name);
		System.out.println(s.address);
		
		Student s2=new Student();
		s2.rno=8;
		s2.name="Zaw Zaw";
		s2.address="Mdy";
		System.out.print("Student 2=");
		System.out.print(s2.rno);
		System.out.print(s2.name);
		System.out.println(s2.address);
	}

}
