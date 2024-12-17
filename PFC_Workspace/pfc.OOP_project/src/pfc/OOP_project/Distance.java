package pfc.OOP_project;
//Type Definition
public class Distance {
		// Data fields
		private int feet;
		private double inches;
		
		
		//constructor
		public Distance() {
			
			
		}
		public Distance(double totalInches) {
			this.feet = (int)totalInches/12;
			this.inches = totalInches-this.feet*12;
		}
		public Distance(int feet, double inches) {
			this.feet = feet;
			this.inches = inches;
		}
		
		//methods
		public void display() {
			System.out.println(this.feet+"\'"+this.inches+"\'");
		}
		public int getFeet() {
			return feet;
		}
		public void setFeet (int feet){
			this.feet = feet;		
		}
		public void getInches (){
			return inches;		
		}
		public void setInches(double inches) {
			this.inches = inches;
		}
}
