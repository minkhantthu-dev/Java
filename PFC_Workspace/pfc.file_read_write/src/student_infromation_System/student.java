package student_infromation_System;

import java.io.BufferedReader;

public class student {
	
	public String sno;
	public String name;
	
	public boolean acceptStudentInfo() {
		try {
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("Enter student no: ");
		this.sno = r.readLine();
		
		if(this.sno.isEmpty()) {
		System.out.print("Please Enter student NO; ");
		return false;
		
		System.out.print("Enter student name: ");
		this.name = r.readLine();
		
		if(this.name.isEmpty()) {
		System.out.print("Please Enter student name: ");
		return false;
			
		}catch(IOException + e) {
			System.out.print("IOException :" + e);
		}
		return true;
	}
	
	public boolean saveStudentInfo() {
		if()
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
