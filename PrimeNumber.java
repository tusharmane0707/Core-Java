package LogicalProgramming;

import java.util.Scanner;

public class PrimeNumber {
	public static void isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(" It is Prime Number ");
		}
		else {
			System.out.println(" It is not a Prime Number ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		isPrime(n); // 5 , 7
	}

}
