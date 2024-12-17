package pfc.file_read_write;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Test_File_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(1, "Aung");
		student s2 = new student();
		s2.setId(2);
		s2.setName("mg moe");
		
		
		try {
			File file = new File("myfile.txt");
			PrintWriter pw = new PrintWriter(new FileWriter(file,true));
			pw.println(s1.getId()+", "+s1.geName());
			pw.println(s2.getId()+", "+s2.geName());
			pw.close();
			
			System.out.println("File Write successful.");
			System.out.println("Find myfile.txt from your Project, an open it, check data");
			
		}catch(IOException e) {
			System.out.println("IOException e:" +e);
		}
		
		
		
		

	}

}
