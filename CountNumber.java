package LogicalProgramming;

import java.util.Scanner;

public class CountNumber {
	public static void isCount(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		
		// Another way to count 
		
//		for(;n>0;n=n/10) {
//			count++;
//		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n= sc.nextInt();
		isCount(n);   //12345

	}

}
