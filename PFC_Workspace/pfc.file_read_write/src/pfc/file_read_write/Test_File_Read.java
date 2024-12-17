package pfc.file_read_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test_File_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
			String readData = " ";
			
			while((readData = br.readLine())!=null) {
				String[]data = readDataStr.split(", ");
				student s = new student();
				s.setId (Integer.parseInt(data[0]));
				s.setname(data[1]);
				System.out.println("read data: " + s.getId()+""+s.getName());
			}
			br.close();
		}catch(IOException e) {
			System.out.println("IOException: "+ e);
		}
		
		
	}

}
