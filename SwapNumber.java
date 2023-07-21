package LogicalProgramming;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of a = ");	//10
		int a=sc.nextInt();
		System.out.println("Enter a value of b = ");	//20
		int b=sc.nextInt();
		
		// Swap two numbers by using 3rd variable
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);	//20
		System.out.println(b);	//10

	}

}
