package LogicalProgramming;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int n) {
		int z=n;
		int count=0;
		int sum=0;
		
		// count the numbers
		while(z>0) {
			z=z/10;
			count++;
		}
		z=n; 
		while(z>0) {
			int lastdigit=z%10;  // finding last digit
			int prod=1;
			
			for(int i=1;i<=count;i++) {
				prod=prod*lastdigit;  // product of lastdigit
			}
			sum=sum+prod;   // sum of product
			z=z/10;
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
			
	}
		

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number = ");
	int n=sc.nextInt();
	System.out.println(isArmstrong(n)); // 153

	}

}
