package BasicorePrograms;
import java.util.Scanner;
public class HarmonicNumber {

	public static void harmonicNumber(int N) {
		int sum=0;
		for(int i=0;i<=N;i++) {
			sum = sum+i;
	}
		System.out.println(N+"th harmonic number is : "+"1/"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number to get Nth Haramonic number");
		Scanner scanner = new Scanner(System.in);
		int harmonicNum = scanner.nextInt();
		harmonicNumber(harmonicNum);

	}

}
