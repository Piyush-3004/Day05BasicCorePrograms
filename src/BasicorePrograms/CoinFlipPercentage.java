package BasicorePrograms;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipPercentage {
	
	
	public static void coinFlipPercentage(int num) {
		double hCount= 0;
		double tCount=0;
		Random random = new Random();		
		for(int i=1 ; i<=num ; i++) {
			float coinFlip = random.nextFloat();
			if(coinFlip<0.5) 
				hCount = hCount +1;
			else  
				tCount = tCount +1;
		}

		double perh = (hCount/num)*100;
		double pert = (tCount/num)*100;
		System.out.println(perh+" % times heads was occured");
		System.out.println(pert+" % times tails was occured");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		coinFlipPercentage(num);

	}

}
