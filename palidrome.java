//2. Write a program to check if a even number is palindrome or not

import java.util.Scanner;

public class palidrome {
	
	public static void main(String[] args) {
		
		int n,r;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		int copyN = n;
		
		while(n>0)
		{
			r = n%10;
			sum = sum*10 + r;
			n=n/10;
		}
		
		if(copyN == sum)
			System.out.println(copyN + " is a palidrome"); 
		else
			System.out.println(copyN + " is a not palidrome");
		
	}

}