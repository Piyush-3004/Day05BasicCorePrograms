package BasicorePrograms;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void getPowersOfTwo(int pow) {
		System.out.print(1+" , ");
		System.out.print(2+" , ");
		int x=2;
		for(int i=0;i<=pow-2;i++) {
			x=x*2;
			if (i==pow-2)
				System.out.print(x);
			else
				System.out.print(x+" , ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Power of two to be printed, upto 31 since 2^31 overflows an int");
		int power = scanner.nextInt();
		getPowersOfTwo(power);

	}

}
