// Program to find whether a number is a prime number or not.

import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0;
		
		System.out.println("Enter the number to check : ");
		num = sc.nextInt();
		
		sc.close();
		
		int a;
		int b;
		
		for(int i=1; a<=b; i++)
		{
			a = i;
			b = num/a;
			
			if(num%i == 0)
				count+=2;
		}
		
		if(count == 2)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}
