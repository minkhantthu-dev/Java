package pfc.operator_project.logical;

public class TestBinarry {
	//operand value can be boolean (true,false)
	
	public static void main(String[] args) {
		
		System.out.println("----And (&&)-----");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("----Or (||)-----");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		int b_mark=85,e_mark=35,m_mark=100;
		System.out.println("----Test-----");
		System.out.println(b_mark>40 && e_mark>40 && m_mark>40);

	}

}
