//1. Write a program to divide, multiply, subtract and addition of two numbers

import java.util.Scanner;

public class calc {

	static int multiply(int a,int b)
	{
		return a*b;
	}
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int sub(int a,int b)
	{
		return a-b;
	}
	
	static int divide(int a,int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) {
		
		int n1,n2;
		String option;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Operation Menu ");
			System.out.println("1. Add()");
			System.out.println("2. Subtract()");
			System.out.println("3. Multiply()");
			System.out.println("4. Divide()");
			System.out.println("0. Exit()");
			
			System.out.println("Enter the operation to perform : ");
			num = sc.nextInt();
			
			
			switch(num)
			{
			case 0: 
				System.out.println("Exited");
				System.exit(0);
				break;
			
			case 1: 
				System.out.println("Enter the numbers : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				
				System.out.println("The Sum is " + add(n1,n2));
				break;
			
			case 2: 
				System.out.println("Enter the numbers : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				
				System.out.println("The Subtraction is " + sub(n1,n2));
				break;
				
			case 3: 
				System.out.println("Enter the numbers : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				
				System.out.println("The Multiplication is " + multiply(n1,n2));
				break;
				
			case 4: 
				System.out.println("Enter the numbers : ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				
				System.out.println("The Division is " + divide(n1,n2));
				break;
				
			default : 
				System.out.println("Wrong option");
			    break;
				
			};
			
		}while(num!=0);
		
		sc.close();	
	}
}