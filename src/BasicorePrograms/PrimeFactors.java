package BasicorePrograms;

import java.util.Scanner;

public class PrimeFactors {
	
	public static void getPrimeFactors(int number) {
		int primeFactor = 0;
		int factor=0;
		boolean factorIsPrime=true;
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				factor=i;
				for(int j=2;j*j<=factor;j++) {
					if(factor%j==0) {
						factorIsPrime=false;
						break;}
					else
						factorIsPrime=true;
				}
				if(factorIsPrime==true)
				System.out.println(factor);						
			}
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to get its prime factors");		
		int number = scanner.nextInt();
		getPrimeFactors(number);

	}

}
