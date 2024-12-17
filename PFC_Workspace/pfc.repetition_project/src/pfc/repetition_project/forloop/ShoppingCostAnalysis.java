package pfc.repetition_project.forloop;

import java.util.Scanner;

public class ShoppingCostAnalysis {

	public static void main(String[] args) {
		double max, min;
		int i, n;
		Scanner sc=new Scanner(System.in);
		System.out.print("How many item did you buy today? : ");
		n=sc.nextInt();
		int[] a = new int[n];
		int total = 0;
       
        for (i = 0; i < n; i++) {
            System.out.print("Enter Item " + (i + 1) + " Amount: ");
            a[i] = sc.nextInt();
            total += a[i];
       
        }
        max=min=a[0];
        	if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        double avg = total / n;
        
        System.out.println("Maximum Amount: " + max);
        System.out.println("Minimum Amount: " + min);
        System.out.println("Average Amount: " + avg);
        System.out.println("Total Amount: " + total);
		

	}

}
