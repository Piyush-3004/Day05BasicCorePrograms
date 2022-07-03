package BasicorePrograms;

import java.util.Scanner;
public class LeapYear {
	
	
	public static boolean checkLeap(int year) {
		if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) 
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter four digit Number");
		int year = scanner.nextInt();
		boolean check = checkLeap(year);
		if(check==true)
			System.out.println(year+" is Leap year");
		else
			System.out.println(year+" is not Leap year");

	}

}
