package LogicalProgramming;

import java.util.Scanner;

public class NeonNumber {
	public static String isNeon(int n) {
		int sum=0;
		int square=n*n;
		while(square>0) {
			int lastdigit=square%10;
			sum=sum+lastdigit;
			square=square/10;
		}
		if(sum==n) {
			return "It is a Neon Number";
		}
		else {
			return "It is not a Neon Number";
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number = ");
	int n=sc.nextInt();
	System.out.println(isNeon(n));  // (0,1,9 square)
	}

}
