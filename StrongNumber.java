package LogicalProgramming;

import java.util.Scanner;

public class StrongNumber {
	public static String isStrong(int n) {
		int sum=0;
		int temp=n;
		
		while(n>0) {
			int lastdigit=n%10;
			int fact=1;
			
		while(lastdigit>0) {
			fact=fact*lastdigit;
			lastdigit--;
		}
		sum=sum+fact;
		n=n/10;
		}
		if(sum==temp) {
			return "It is a Strong Number ";
		}
		else {
			return "It is not a Strong Number ";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n=sc.nextInt();
		System.out.println(isStrong(n)); //145
	}

}
