package LogicalProgramming;

import java.util.Scanner;

public class DiscriumNumber {
	public static boolean isDiscrium(int n) {
		int count=0;
		int sum=0;
		int z=n;
		
		while(z>0) {
			z=z/10;
			count++;
		}
		
		z=n;
		while(z>0) {
			int lastdigit=z%10;
			int prod=1;
			
			for(int i=1;i<=count;i++) {
				prod=prod*lastdigit;
				}
			count--;
			sum=sum+prod;
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
	System.out.println(isDiscrium(n));		//175

	}

}
