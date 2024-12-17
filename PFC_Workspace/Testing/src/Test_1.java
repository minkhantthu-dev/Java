
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] a = {4,7,4,8,100,9,5};
		int temp;
		for (int i=1; i<a.length;i++) {
			for(int j=i; j<a.length; j++) {
				if(a[i-1]<a[j]) {
					temp = a[i-1];
					a[i-1]= a[j];
					a[j]= temp;
				}
			}
		}
		
		for(int element :a) {
			System.out.print(element+",");
		}
		
		//if(a[0]<a[1]) {
			//temp = a[0];
			//a[0]= a[1];
			//a[1]= temp;
		//}
		//if(a[0]<a[2]) {
			//temp = a[0];
			///a[0]= a[2];
			//a[2]= temp;
		//}
		

	}

}
