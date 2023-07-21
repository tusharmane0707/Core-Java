package LogicalProgramming;

import java.util.Scanner;

public class SpyNumber {

	public static void isSpy(int n) {
		int sum=0;
		int prod=1;
		
		while(n>0) {
			int lastdigit=n%10;
			sum=sum+lastdigit;
			prod=prod*lastdigit;
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("It is a Spy Number");
		}
		else {
			System.out.println("It is not a Spy Number");
		}
	}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number = ");
	int n=sc.nextInt();
	isSpy(n); //1124

	}

}
