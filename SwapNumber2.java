package LogicalProgramming;

import java.util.Scanner;

public class SwapNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value of a = ");	//10
		int a=sc.nextInt();
		System.out.println("Enter a value of b = ");	//20
		int b=sc.nextInt();
		
		// Swap two numbers by without using 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);	//20
		System.out.println(b);	//10

	}

}
