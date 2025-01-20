package q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		sc.close();

		double[] arr = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		double score1 = arr[n-1];
		double score2 = arr[m-1];
		
		double sum = (score1+score2);
		
		System.out.printf("%.1f \n", sum);
	}

}
