package BasicorePrograms;

import java.util.Random;
import java.util.Scanner;

public class BasicCoreAss6to10 {
	
	public static void main(String[] args) {

		getQuotientAndReminder();
		swapTwoNumbers();
		checkEvenOdd();
		checkLargestOfThree();		
	}
	
	public static void getQuotientAndReminder() {

		System.out.println("##################### Assignment 6 #######################");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter divident and divisor numbers to get the quotient and reminder");
		System.out.println("Enter divident");
		int dividentNumber = scanner.nextInt();
		System.out.println("Enter divisor");
		int divisorNumber = scanner.nextInt();
		float quotient= dividentNumber/ divisorNumber;
		int reminder =dividentNumber%divisorNumber;
		System.out.println("Reminder of "+ dividentNumber+"/"+divisorNumber+"is : " + reminder);
		System.out.println("Quotient of "+ dividentNumber+"/"+divisorNumber+"is : " + quotient);
		
	}
	
	public static void swapTwoNumbers() {
	
		System.out.println("##################### Assignment 7 #######################");	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=scanner.nextInt();
		System.out.println("Enter num2");
		int num2=scanner.nextInt();
		int temp = num1;
		num1=num2;		
		num2=temp;
		System.out.println("value of num1 after swapping is: "+num1+" /nvalue of num2 after swapping is : "+num2);
	}
	
		

	public static void checkEvenOdd() {
				
		System.out.println("##################### Assignment 8 #######################");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check even odd");
		int number= scanner.nextInt();
		if(number%2==0)
			System.out.println(number+" Is Even number");
		else
			System.out.println(number+" Is Odd number");		
		
	}
	
	
	public static void checkVowels() {
		
		System.out.println("##################### Assignment 9 #######################");
		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().charAt(0);
		 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
	            || c == 'U')
			 System.out.println(c+"is vowel");
		 else
			 System.out.println(c+"is an Consonant");
	}		
		 
	
	public static void checkLargestOfThree() {
		 
		 System.out.println("##################### Assignment 10 #######################");
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter first number");
		 int number1 = scanner.nextInt();
		 System.out.println("Enter second number");
		 int number2 = scanner.nextInt();
		 System.out.println("Enter third number");
		 int number3 = scanner.nextInt();
		 
		 if(number1>number2 && number1 > number3)
			 System.out.println(number1+" Is Largest");
		 else if(number2>number1 && number2 > number3)
			 System.out.println(number2+" is Largest");
		 else if(number3>number1 && number3 > number2)
			 System.out.println(number3+" Is Largest");
	
		 
	}
}
