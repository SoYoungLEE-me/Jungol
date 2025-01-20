package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inp = new int[4];
		int sum = 0;
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
			sum += inp[i];
		}

		sc.close();
		
		int avg = sum/inp.length;

		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}

}
